package com.example.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import com.example.app.repository.UserRepository;
import org.springframework.ui.Model;

@Controller
public class UserController {

	@GetMapping("/home")
	public String home(@RequestParam String name, Model m) {
		m.addAttribute("name", name);
		return "home";
	}
}