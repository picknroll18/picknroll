package com.picknroll.web.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/")
public class AdminController {
	@RequestMapping("/member/list")
	public String list(Model model) {
		model.addAttribute("mainTitle", "회원관리");
		return "admin.member.list";
	}
}