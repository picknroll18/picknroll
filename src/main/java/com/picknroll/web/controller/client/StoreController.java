package com.picknroll.web.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/store/")
public class StoreController {
	
	@RequestMapping("list")
	public String list(Model model) {
		return "member.store.list";
	}

}