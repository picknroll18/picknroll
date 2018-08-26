package com.picknroll.web.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/service/")
public class ServiceController {

	@RequestMapping("reg")
	public String reg(Model model) {
		return "admin.service.reg";
	}

	@RequestMapping("list")
	public String list(Model model) {
		return "admin.service.list";
	}

	@RequestMapping("edit")
	public String edit(Model model) {
		model.addAttribute("mainTitle", "서비스관리");
		return "admin.service.edit";
	}

	@RequestMapping("delete")
	public String delete(Model model) {
		model.addAttribute("mainTitle", "서비스관리");
		return "admin.service.delete";
	}

}
