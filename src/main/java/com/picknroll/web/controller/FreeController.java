package com.picknroll.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/free/")
public class FreeController {

	@RequestMapping("list")
	public String list() {
		return "community.free.list";
	}
	
	@RequestMapping("detail")
	public String detail() {
		return "community.free.detail";
	}
	
	@RequestMapping("reg")
	public String reg() {
		return "community.free.reg";
	}
	
	@RequestMapping("edit")
	public String edit() {
		return "community.free.edit";
	}
	
}
