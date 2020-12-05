package com.cameron.DojoController.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/dojo/{location}")
	public String dojo() {
		return "The dojo is awesome!";
	}
	public String burbank(@PathVariable("location") String Burbank) {
		return Burbank + "Dojo is located in Southern California";
	}
	public String sanjose(@PathVariable("location") String sanjose) {
		return "SJ dojo is the headquarters.";
	}
}
