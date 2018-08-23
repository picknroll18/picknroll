package com.picknroll.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/make/")
public class MakeController {

	@RequestMapping("list")
	public String list() {
		return "community.make.list";
	}
	
	@RequestMapping("detail")
	public String detail() {
		return "community.make.detail";
	}
	
	@RequestMapping("reg")
	public String reg() {
		return "community.make.reg";
	}
	
	@RequestMapping("edit")
	public String edit() {
		return "community.make.edit";
	}
	
}