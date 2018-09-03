package com.springmvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String ShowMyPage(){
		return "try";
	}
	
	@RequestMapping("/rank")
	public String Showform(){
		return "rank";
	}
	@RequestMapping("/women")
	public String ShowWomen(){
		return "women";
	}
	/*
	@RequestMapping("/team")
	public String ShowHello(){
		return "team";
	}*/

}
