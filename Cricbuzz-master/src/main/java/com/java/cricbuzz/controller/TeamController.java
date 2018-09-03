package com.java.cricbuzz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.java.cricbuzz.model.DateTesting;
import com.java.cricbuzz.model.ODI;
import com.java.cricbuzz.model.Series;
import com.java.cricbuzz.model.T20;
import com.java.cricbuzz.model.Team;
import com.java.cricbuzz.model.Test;
import com.java.cricbuzz.service.DateTestingService;
import com.java.cricbuzz.service.OdiService;
import com.java.cricbuzz.service.SeriesService;
import com.java.cricbuzz.service.T20Service;
import com.java.cricbuzz.service.TeamService;
import com.java.cricbuzz.service.TestService;

@RestController
public class TeamController {

	@Autowired
	private TeamService teamService;
	
	@Autowired
	private SeriesService seriesService;
	
	@Autowired
	private TestService testService;
	
	@Autowired
	private OdiService odiService;
	
	@Autowired
	private T20Service t20Service;
	
	@Autowired 
	private DateTestingService dateTestingService;
	
	
	
	
	
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
	
	
	@RequestMapping("/Ranking_next")
	public ModelAndView dontUSE(){
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("Ranking_next");
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
	
	@RequestMapping("/Odi_Team")
	public ModelAndView getAllOdiRating(Model model){
		ModelAndView mav=new ModelAndView();
		//mav.addObject("teams",team);
		//mav.setViewName("Teamjsp");
		List teamList = teamService.getAllTeam(); 
		mav.addObject("teamList", teamList);
		mav.setViewName("Odi_Team");
		return mav;
	}
	@RequestMapping("/Test_Team")
	public ModelAndView getAllTestRating(Model model){
		ModelAndView mav=new ModelAndView();
		//mav.addObject("teams",team);
		//mav.setViewName("Teamjsp");
		List teamList = teamService.getAllTeam(); 
		mav.addObject("teamList", teamList);
		mav.setViewName("Test_Team");
		return mav;
	}
	@RequestMapping("/T20_Team")
	public ModelAndView getAllT20Rating(Model model){
		ModelAndView mav=new ModelAndView();
		//mav.addObject("teams",team);
		//mav.setViewName("Teamjsp");
		List teamList = teamService.getAllTeam(); 
		mav.addObject("teamList", teamList);
		mav.setViewName("T20_Team");
		return mav;
	}
	@RequestMapping("/test_table")
	public ModelAndView getAllTest(Model model){
		ModelAndView mav=new ModelAndView();
		//mav.addObject("teams",team);
		//mav.setViewName("Teamjsp");
		List teamList = teamService.getAllTeam(); 
		mav.addObject("teamList", teamList);
		mav.setViewName("test_table");
		return mav;
	}
	
	
	@RequestMapping("/DropTest")
	public ModelAndView getAllTest1(Model model){
		ModelAndView mav=new ModelAndView();
		//mav.addObject("teams",team);
		//mav.setViewName("Teamjsp");
		List teamList = teamService.getAllTeam(); 
		mav.addObject("teamList", teamList);
		mav.setViewName("DropTest");
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
	
	
	
	@RequestMapping(value="/getAllTeam")
	public ModelAndView getAll(Model model){
		ModelAndView mav=new ModelAndView();
		//mav.addObject("teams",team);
		//mav.setViewName("Teamjsp");
		//List teamList = teamService.getAllTeam(); 
		//mav.addObject("teamList", teamList);
		mav.setViewName("Teamjsp");
		return mav;
	
	}
	
	
	
	@RequestMapping("/getTeam")
	public Team getTeam(@RequestParam String teamName) {
	
		 return teamService.getTeam(teamName);
		 
		
	}
	
	
	@RequestMapping("/getOdiTeam")
	public List<Team> getOdiTeam(@RequestParam String teamName) {
	
		 return teamService.getOdiTeam(teamName);
	}
	
	@RequestMapping("/getTestBowlers")
	public ModelAndView getTestBowlers()
	{
		ModelAndView mav= new ModelAndView();
		List<Test> testBowlersList=testService.getTestBowlers();
		mav.addObject("testBowlersList", testBowlersList);
		mav.setViewName("getTestBowlers");
		return mav;
	}
	
	@RequestMapping("/getTestBatsmen")
	public ModelAndView getTestBatsmen()
	{
		ModelAndView mav= new ModelAndView();
		List<Test> testBatsmenList = testService.getTestBatsmen();
		mav.addObject("testBatsmenList", testBatsmenList);
		mav.setViewName("getTestBatsmen");
		return mav;
	}
	
	@RequestMapping("/getTestAllRounder")
	public ModelAndView getTestAllRounder()
	{
		ModelAndView mav= new ModelAndView();
		List<Test> testAllRounderList = testService.getTestAllRounder();
		mav.addObject("testAllRounderList", testAllRounderList);
		mav.setViewName("getTestAllRounder");
		return mav;
	}
	
	
	@RequestMapping("/getOdiBowlers")
	public ModelAndView getOdiBowlers()
	{
		ModelAndView mav= new ModelAndView();
		List<ODI> odiBowlersList=odiService.getOdiBowlers();
		mav.addObject("odiBowlersList", odiBowlersList);
		mav.setViewName("getOdiBowlers");
		return mav;
	}
	
	@RequestMapping("/getOdiBatsmen")
	public ModelAndView getOdiBatsmen()
	{
		ModelAndView mav= new ModelAndView();
		List<ODI> odiBatsmenList=odiService.getOdiBatsmen();
		mav.addObject("odiBatsmenList", odiBatsmenList);
		mav.setViewName("getOdiBatsmen");
		return mav;
	}
	
	@RequestMapping("/getOdiAllRounder")
	public ModelAndView getOdiAllRounder()
	{
		ModelAndView mav= new ModelAndView();
		List<ODI> odiAllRounderList=odiService.getOdiAllRounder();
		mav.addObject("odiAllRounderList", odiAllRounderList);
		mav.setViewName("getOdiAllRounder");
		return mav;
	}
	
	@RequestMapping("/getT20Bowlers")
	public ModelAndView getT20Bowlers()
	{
		ModelAndView mav= new ModelAndView();
		List<T20> t20BowlersList=t20Service.getT20Bowlers();
		mav.addObject("t20BowlersList", t20BowlersList);
		mav.setViewName("getT20Bowlers");
		return mav;
	}
	
	@RequestMapping("/getT20Batsmen")
	public ModelAndView getT20Batsmen()
	{
		ModelAndView mav= new ModelAndView();
		List<T20> t20BatsmenList=t20Service.getT20Batsmen();
		mav.addObject("t20BatsmenList", t20BatsmenList);
		mav.setViewName("getT20Batsmen");
		return mav;
		
	}
	
	@RequestMapping("/getT20AllRounder")
	public ModelAndView getT20AllRounder()
	{
		ModelAndView mav= new ModelAndView();
		List<T20> t20AllRounderList=t20Service.getT20AllRounder();
		mav.addObject("t20AllRounderList", t20AllRounderList);
		mav.setViewName("getT20AllRounder");
		return mav;
	}
	
	@RequestMapping("/getAllDateTest")
	public List<DateTesting> getAllDateTest()
	{
		return dateTestingService.getAllDate();
	}
	
}
