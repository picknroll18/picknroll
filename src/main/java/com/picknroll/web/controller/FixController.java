package com.picknroll.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fix/")
public class FixController {

	@RequestMapping("list")
	public String list() {
		return "community.fix.list";
	}
	
	@RequestMapping("detail")
	public String detail() {
		return "community.fix.detail";
	}
	
	@RequestMapping("reg")
	public String reg() {
		return "community.fix.reg";
	}
	
	@RequestMapping("edit")
	public String edit() {
		return "community.fix.edit";
	}
	
}