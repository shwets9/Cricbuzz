package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Service.searchService;
import com.example.demo.model.Search;

@RestController
public class Searchcontroller {

	@Autowired
	private searchService Service;
	
	
	@RequestMapping("/create")
	public String create(@RequestParam String playerName,@RequestParam String national_Side ,@RequestParam String born,@RequestParam String height,@RequestParam String batting,@RequestParam String bowling,@RequestParam String role,@RequestParam String test_Runs,@RequestParam String odi_Runs,@RequestParam String test_Wickets,@RequestParam String odi_Wickets)
	{
		Search t= Service.create(playerName, national_Side, born, height,batting,bowling,role,test_Runs,odi_Runs,test_Wickets,odi_Wickets);
		return t.toString();
	}

	
	
	@RequestMapping("/getAllSearch")
	public ModelAndView getAll(Model model){
		ModelAndView mav=new ModelAndView();
		//mav.addObject("teams",team);
		//mav.setViewName("test");
		List searchList = Service.getAllSearch(); 
		mav.addObject("searchList", searchList);
		mav.setViewName("test");
		return mav;
	}
	@RequestMapping("/")
	public ModelAndView rank(){
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("test");
		return mav;
	}
	
	/*@RequestMapping("/women")
	public ModelAndView women(){
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("women");
		return mav;
	}
	
	@RequestMapping("/getAllSearch")
	public ModelAndView getAll(Model model){
		ModelAndView mav=new ModelAndView();
		//mav.addObject("teams",team);
		//mav.setViewName("test");
		List teamList = Service.getAllSearch(); 
		mav.addObject("teamList", teamList);
		mav.setViewName("test");
		return mav;
	
	}
	/*@RequestMapping("/")
	@ResponseBody
	public String work(){
		return "Teamjsp";
	}*/
	
	
	
	/*@RequestMapping(value="/getAllTeam")
	public ModelAndView getAll(Model model){
		ModelAndView mav=new ModelAndView();
		//mav.addObject("teams",team);
		//mav.setViewName("Teamjsp");
		//List teamList = teamService.getAllTeam(); 
		//mav.addObject("teamList", teamList);
		mav.setViewName("Teamjsp");
		return mav;
	
	}*/
	
	@RequestMapping("/getSearch")
	public Search getSearch(@RequestParam String playerName) {
	
		 return Service.getSearch(playerName);
	}
}

