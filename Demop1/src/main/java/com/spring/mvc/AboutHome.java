package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AboutHome {
	@RequestMapping("/punith")
	public String user() {
		return "punith";
	}
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	@RequestMapping("/")
	public String display() {
		return "index";
	}


}
