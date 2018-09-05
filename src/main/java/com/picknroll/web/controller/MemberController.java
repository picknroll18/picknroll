package com.picknroll.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.picknroll.web.entity.Member;
import com.picknroll.web.service.MemberService;

@Controller
@RequestMapping("/member/")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("join")
	public String join() {
		return "member.join";
	}

	@GetMapping("login")
	public String login(Model model) {
		List<Member> memberList = memberService.getList();
		model.addAttribute("memberList", memberList);
		return "member.login";
	}
	
	@GetMapping("join-detail")
	public String joinDetail() {
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
	
	@GetMapping("find-id")
	public String findId() {
		return "member.find-id";
	}
	
	@GetMapping("detail-edit")
	public String detailEdit() {
		return "member.detail-edit";
	}
	
	@GetMapping("profile")
	public String profile() {
		return "member.profile";
	}
	
	
}