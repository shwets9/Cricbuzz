package com.bootstrap.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class bootstrapController {
	
	/*@RequestMapping("/")
	public String home(){
	  return "boot";
	}
*/
	@RequestMapping("/boot")
	public ModelAndView show() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("boot");
		return mv;
	}
}
