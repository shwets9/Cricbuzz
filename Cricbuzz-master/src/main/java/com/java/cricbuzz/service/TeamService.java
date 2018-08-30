package com.java.cricbuzz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.cricbuzz.model.Team;
import com.java.cricbuzz.repository.TeamRepository;

@Service
public class TeamService {
	@Autowired
	private TeamRepository teamRepository;
	
	public List<Team> getAllTeam()
	{
		return teamRepository.findAll();
	}
	
	public Team getTeam(String teamName)
	{
		return teamRepository.findByTeamName(teamName);
	}
}
