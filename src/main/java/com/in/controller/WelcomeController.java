package com.in.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WelcomeController {

	@GetMapping("/welcome")
	public String getMsg() {

		String msg = "Hi I am Controller";

		return msg;

	}
}
