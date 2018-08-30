package com.java.cricbuzz.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.java.cricbuzz.model.Team;
import com.java.cricbuzz.service.TeamService;

@RestController
public class TeamController {

	@Autowired
	private TeamService teamService;
	
	@RequestMapping("/getAllTeam")
	public List<Team> getAll(){
		return teamService.getAllTeam();
	}
	
	@RequestMapping("/getTeam")
	public Team getTeam(@RequestParam String teamName) {
	
		 return teamService.getTeam(teamName);
	}
}
