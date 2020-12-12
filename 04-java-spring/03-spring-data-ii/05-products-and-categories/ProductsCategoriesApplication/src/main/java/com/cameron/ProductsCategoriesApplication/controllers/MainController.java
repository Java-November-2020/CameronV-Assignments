package com.cameron.ProductsCategoriesApplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MainController {
	@GetMapping("/")
	public static String home() {
		return "index.jsp";
	}
}
