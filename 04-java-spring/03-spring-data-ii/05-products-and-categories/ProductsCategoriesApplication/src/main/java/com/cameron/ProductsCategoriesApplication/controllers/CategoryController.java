package com.cameron.ProductsCategoriesApplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class CategoryController {
	@GetMapping("/categories")
	public static String products() {
		return "categories.jsp";
	}
	
}
