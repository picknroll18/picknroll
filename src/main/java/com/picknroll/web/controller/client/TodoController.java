package com.picknroll.web.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/client/todo/")
public class TodoController {

	@RequestMapping("list")
	public String list() {
		return "client.todo.list";
	}

}
