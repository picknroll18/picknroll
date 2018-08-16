package com.picknroll.web.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/notice/")
public class NoticeController {

	@RequestMapping("reg")
	public String reg() {
		return "/WEB-INF/views/admin/service/reg.jsp";
	}

	@RequestMapping("list")
	public String list() {
		return "/WEB-INF/views/admin/service/reg.jsp";
	}

	@RequestMapping("edit")
	public String edit() {
		return "/WEB-INF/views/admin/service/reg.jsp";
	}

	@RequestMapping("detail")
	public String detail() {
		return "/WEB-INF/views/admin/service/reg.jsp";
	}

	@RequestMapping("delete")
	public String delete() {
		return "/WEB-INF/views/admin/service/list.jsp";
	}

}