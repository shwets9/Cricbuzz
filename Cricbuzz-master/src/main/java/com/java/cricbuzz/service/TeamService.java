package com.java.cricbuzz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.java.cricbuzz.model.Team;
import com.java.cricbuzz.model.Test;
import com.java.cricbuzz.repository.TeamRepository;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

@Service
public class TeamService {
	@Autowired
	private TeamRepository teamRepository;
	@Autowired
	private MongoTemplate mongoTemplate;
	
	
	//Create operation
		public Team create(String teamName,int odiRating , int t20Rating, int testRating)
		{
			return teamRepository.save(new Team(teamName, odiRating, t20Rating, testRating));
		}
	
	public List<Team> getAllTeam()
	{
		return teamRepository.findAll();
	}
	
	public Team getTeam(String teamName)
	{
		return teamRepository.findByTeamName(teamName);
	}
	
	
	
	public  List<Team> getOdiTeam(String teamName)
	{
		Query query = new Query();
		query.addCriteria(Criteria.where("teamName").is(teamName));
		List<Team> teamNameList = mongoTemplate.find(query,Team.class);
		return teamNameList;
	}
	
	
	
}
