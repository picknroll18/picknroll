package com.picknroll.web.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.util.Random;
import java.util.UUID;

import javax.imageio.ImageIO;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.picknroll.web.entity.Member;
import com.picknroll.web.service.MemberService;
import com.picknroll.web.util.GenerateCertCharacter;

@Controller
@RequestMapping("/member/")
public class MemberController {

	@Autowired
	private MemberService service;

	@Autowired
	private JavaMailSender mailSender;

	@GetMapping("is-id-duplicated")
	@ResponseBody // 뷰를 찾지 말아라.. ResponseBody
	public String isIdDuplicated(String id) {
		// 한글처리를 해줘야 한다.
		boolean duplicated = service.isIdDuplicated(id);
		if (duplicated)
			return "true";
		return "false";
	}

	@GetMapping("is-nickname-duplicated")
	@ResponseBody // 뷰를 찾지 말아라.. ResponseBody
	public String isNicknameDuplicated(String nickname) {
		// 한글처리를 해줘야 한다.
		boolean duplicated = service.isNicknameDuplicated(nickname);
		System.out.println(duplicated);
		if (duplicated)
			return "true";
		return "false";
	}

	@GetMapping("is-email-duplicated")
	@ResponseBody // 뷰를 찾지 말아라.. ResponseBody
	public String isEmailDuplicated(String email) {
		// 한글처리를 해줘야 한다.
		boolean duplicated = service.isEmailDuplicated(email);

		if (duplicated)
			return "true";

		// ---이메일 보내기-----------------------------------------------------------
		MimeMessage message = mailSender.createMimeMessage();
		String certify = GenerateCertCharacter.excuteGenerate();
		try {
			// 마임 = 멀티미디어 포함
			MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
			helper.setFrom("noreply@newlecture.com");
			helper.setTo(email);
			helper.setSubject("PicknRoll 회원가입을 위한 인증메일");
			// 이메일보낼때.. 파라미터 이름 줄여서 쓰자~

			helper.setText("<h1>PicknRoll 가입 인증 번호</h1><h2>" + certify + "</h2>", true);

		} catch (MessagingException e) {
			e.printStackTrace();
		} // 쉽게 구현해주는 객체

		mailSender.send(message);
		return certify;
	}

	@GetMapping("join-reg")
	public String joinReg(Model model) {
		return "member.join-reg";
	}

	// 회원가입
	@PostMapping("join-reg")
	public String joinReg(Model model, Member member) {
		if (member == null)
			return "redirect:join-error";
		int count = service.insertMemberWithBcrypt(member);
		model.addAttribute("id", member.getId());
		return "member.join-detail";
	}

	@GetMapping("join-error")
	public String joinError() {
		return "member.join-error";
	}

	@PostMapping("join-email")
	public String joinEmail(String email, HttpServletResponse response) {

		// 기 등록자 이메일 체크
		// 오류 페이지로 가야하나... 메시지 박스를 던져야 하나...
		boolean duplicated = service.isEmailDuplicated(email);
		System.out.println(email);
		System.out.println(duplicated);

		if (duplicated)
			return "redirect:email-duplicated-error";

		// --------------------------------------------------------------

		// 유니크한 id를 뽑아내야 한다. guid
		UUID uuid = UUID.randomUUID(); // + 커스텀

		MessageDigest salt = null;
		String digest = null;

		// 지문 채취 작업
		try {

			salt = MessageDigest.getInstance("SHA-256");
			salt.update(uuid.toString().getBytes()); // 넘겨줄 값이 byte이다.

			// 바이트열을 문자열로 바꾸기 위해서 더하기가 반복되어야 한다.
			byte[] key = salt.digest();

			// 문자열 연결에 효율적이다.
			StringBuilder builder = new StringBuilder();

			for (byte b : key)
				builder.append(String.format("%02x", b)); // 포맷팅

			digest = builder.toString();

			System.out.println(digest);
			// 940dc385f2f8b6451fdf736329fedee08f6c5033fe621a146423983b05450442

		} catch (NoSuchAlgorithmException e1) {
			e1.printStackTrace();
		}

		// 표기법으로 데이터를 구분해준다.(json, xml)

		// 쿠키를 심는 작업
		Cookie cookie = new Cookie("joinId", digest); // 식별값, 문자열만 담아야 한다.

		// member로 경로를 줄인다
		cookie.setPath("/member/"); // 경로 member에서만 쓴다.
		cookie.setMaxAge(60 * 60 * 24); // 단위

		response.addCookie(cookie);

		// 메시지 만들기
		MimeMessage message = mailSender.createMimeMessage();
		try {
			// 마임 = 멀티미디어 포함
			MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
			helper.setFrom("noreply@newlecture.com");
			helper.setTo(email);
			helper.setSubject("뉴렉처 회원가입을 위한 인증메일");
			// 이메일보낼때.. 파라미터 이름 줄여서 쓰자~
			helper.setText(
					"<a href='http://localhost:8080/member/join-reg?id=" + digest + "&em=" + email + "'>가입링크</a>",
					true);

		} catch (MessagingException e) {
			e.printStackTrace();
		} // 쉽게 구현해주는 객체

		mailSender.send(message);
		return "member.join-email-info";

	}

	@GetMapping("login")
	public String login(Model model) {
		return "member.login";
	}

	// 세부사항 회원가입
	@PostMapping("join-detail")
	public String joinDetail(Member member, 
			@RequestParam("photo-file") MultipartFile photoFile,
			HttpServletRequest request) {
		try {
			String uploadedFileName = service.insertProfilePicture(member.getId(), photoFile, request);
			member.setPhoto(uploadedFileName);
			int count = service.updateMemberDetail(member);
		} catch (IOException e) {
			e.printStackTrace();
			return "redirect:join-error";
		}
		return "redirect:../index";
	}

	// 세부사항 회원가입
	@GetMapping("join-detail")
	public String joinDetail(Model model) {
		model.addAttribute("id", "flwj");
		return "member.join-detail";
	}

	@GetMapping("pwd-reset")
	public String pwdReset() {
		return "member.pwd-reset";
	}

	@GetMapping("pwd-edit")
	public String pwdEdit() {
		return "member.pwd-edit";
	}
	
	@PostMapping("pwd-edit")
	public String pwdEdit(@RequestParam("new-password") String newPassword,		
						  Principal principal){
		String id = principal.getName();
		int count = service.updateMemberPassword(id, newPassword);
		return "redirect:profile";
	}

	@GetMapping("find-id")
	public String findId() {
		return "member.find-id";
	}

	@GetMapping("detail-edit")
	public String detailEdit(Model model, Principal principal) {
		String id = principal.getName();
		Member member = service.getMember(id);
		model.addAttribute("member", member);
		return "member.detail-edit";
	}
	
	// 세부사항 업데이트
	@PostMapping("detail-edit")
	public String detailEdit(Member member, Principal principal,
			@RequestParam("photo-file") MultipartFile photoFile,
			HttpServletRequest request) {
		String id = principal.getName();
		member.setId(id);
		try {
			if(!photoFile.getOriginalFilename().equals("")) {
				String uploadedFileName = service.updateProfilePicture(id, photoFile, request);
				member.setPhoto(uploadedFileName);
			}
			int count = service.updateMemberDetail(member);
			System.out.println(count);
		} catch (IOException e) {
			e.printStackTrace();
			return "redirect:join-error";
		}
		return "redirect:profile";
	}

	@GetMapping("profile")
	public String profile(Model model, Principal principal) {
		// session에 있는 id를 
		// id를 얻어야 함
		String id = principal.getName();
		System.out.println(id);
		Member member = service.getMember(id);
		model.addAttribute("member", member);
		return "member.profile";
	}
	
	// 동적으로 이미지 만들기 - 일단 추가해 놓는데 나중에 해봐
	@GetMapping("checker.jpg")
	public void checker(HttpSession session, HttpServletResponse response) throws IOException {
		Random rand = new Random();
		int x = rand.nextInt(100);
		int y = rand.nextInt(10);
		
		String fmtString = String.format("%d+%d=", x,y);
		
		// 세션 값에 넣기
		session.setAttribute("checker", x+y); // checker
		
		// 메모리 상의 이미지가 필요하다. 비트맵이라는 도화지
		BufferedImage img = new BufferedImage(60, 30, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g = img.createGraphics();
		g.setFont(new Font("돋움", 0, 13)); // 글씨체, 스타일, 크기
		g.setColor(Color.WHITE); 
		g.fillRect(0, 0, 60, 30); 
		g.setColor(Color.BLACK); 
		g.drawString(fmtString, 5, 19);
		response.setContentType("image/png");
		ImageIO.write(img, "png", response.getOutputStream()); // 예외처리 원래는 해야 함
		
	}

	
	@GetMapping("join-email")
	public String joinEmail() {
		return "member.join-email";
	}
	

}