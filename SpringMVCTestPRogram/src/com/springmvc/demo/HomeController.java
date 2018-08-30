package com.springmvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String ShowMyPage(){
		return "NavigationBar";
	}
	
	@RequestMapping("/rank")
	public String Showform(){
		return "rank";
	}
	
	@RequestMapping("/team")
	public String ShowHello(){
		return "team";
	}

}
