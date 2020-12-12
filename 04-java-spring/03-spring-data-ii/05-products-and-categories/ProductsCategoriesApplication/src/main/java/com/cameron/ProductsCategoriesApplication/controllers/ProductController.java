package com.cameron.ProductsCategoriesApplication.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
	@GetMapping("/products")
	public static String products() {
		return "products.jsp";
	}
	
}
