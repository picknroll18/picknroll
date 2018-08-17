package com.picknroll.web.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/service/")
public class ServiceController {
	
	@RequestMapping("reg")
	public String reg() {
		return "admin/service/reg";
	}
	
	@RequestMapping("list")
	public String list() {
		return "admin/service/list";
	}
	
	@RequestMapping("edit")
	public String edit() {
		return "admin/service/edit";
	}
	
	@RequestMapping("delete")
	public String delete() {
		return "admin/service/delete";
	}

}
