package com.example.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import com.example.app.repository.UserRepository;
import org.springframework.ui.Model;


@Controller
public class UserController {

	@GetMapping("/hello")
	public String hello(@RequestParam String name, Model m) {
		// String hello = "Hello, World!";
		m.addAttribute("name", name);
		return "test";
	}
}