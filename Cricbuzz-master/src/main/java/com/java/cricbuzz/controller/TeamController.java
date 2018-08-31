package com.java.cricbuzz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.java.cricbuzz.model.Series;
import com.java.cricbuzz.model.Team;
import com.java.cricbuzz.service.SeriesService;
import com.java.cricbuzz.service.TeamService;

@RestController
public class TeamController {

	@Autowired
	private TeamService teamService;
	
	@Autowired
	private SeriesService seriesService;
	
	@RequestMapping("/createTeam")
	public String create(@RequestParam String teamName,@RequestParam int odiRating ,@RequestParam int t20Rating,@RequestParam int testRating)
	{
		Team t= teamService.create(teamName, odiRating, t20Rating, testRating);
		return t.toString();
	}

	@RequestMapping("/")
	public ModelAndView home(){
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("try");
		return mav;
	}
	
	
	@RequestMapping("/dontUSE")
	public ModelAndView dontUSE(){
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("dontUSE");
		return mav;
	}
	
	
	@RequestMapping("/rank")
	public ModelAndView rank(){
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("rank");
		return mav;
	}
	
	@RequestMapping("/women")
	public ModelAndView women(){
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("women");
		return mav;
	}
	@RequestMapping("/League")
	public ModelAndView League(){
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("League");
		return mav;
	}
	@RequestMapping("/International")
	public ModelAndView International(){
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("International");
		return mav;
	}
	
	@RequestMapping("/getAllTeam")
	public ModelAndView getAll(Model model){
		ModelAndView mav=new ModelAndView();
		//mav.addObject("teams",team);
		//mav.setViewName("Teamjsp");
		List teamList = teamService.getAllTeam(); 
		mav.addObject("teamList", teamList);
		mav.setViewName("Teamjsp");
		return mav;
	}
	
	@RequestMapping("/getSeries")
	public ModelAndView getSeries()
	{
		ModelAndView mav= new ModelAndView();
		List<Series> seriesList= seriesService.getAllSeries();
		mav.addObject("seriesList", seriesList);
		mav.setViewName("Series");
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
	
	@RequestMapping("/getTeam")
	public Team getTeam(@RequestParam String teamName) {
	
		 return teamService.getTeam(teamName);
	}
}
