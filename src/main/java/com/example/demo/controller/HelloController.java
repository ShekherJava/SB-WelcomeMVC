package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	//@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@GetMapping("/hello")
	public String sayHello() {
		return "welcome";
	}

}
