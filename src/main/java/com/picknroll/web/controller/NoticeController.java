package com.picknroll.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/notice/")
public class NoticeController {

	@RequestMapping("list")
	public String list() {
		return "community.notice.list";
	}
	
	@RequestMapping("detail")
	public String detail() {
		return "community.notice.detail";
	}
	
	@RequestMapping("reg")
	public String reg() {
		return "community.notice.reg";
	}
	
	@RequestMapping("edit")
	public String edit() {
		return "community.notice.edit";
	}
	
}