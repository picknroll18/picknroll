package com.picknroll.web.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("adminMemberController")
@RequestMapping("/admin/member/list")
public class MemberController {
	
	@RequestMapping("/member/list")
	public String list(Model model) {
		model.addAttribute("mainTitle", "회원관리");
		return "admin.member.list";
	}

}
