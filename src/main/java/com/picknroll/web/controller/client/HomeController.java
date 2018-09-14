package com.picknroll.web.controller.client;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("clientHomeController")
@RequestMapping("/client/")
public class HomeController {

	@GetMapping("index")
	public String index(Principal principal) {
		// 인증한 사용자의 이름이 나온다. 필요할 때 쓰자~~
		System.out.println(principal.getName());
		return "client.index";
	}

}