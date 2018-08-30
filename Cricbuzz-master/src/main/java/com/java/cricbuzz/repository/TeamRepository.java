package com.java.cricbuzz.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.java.cricbuzz.model.Team;

public interface TeamRepository extends MongoRepository<Team, String>{

	public Team findByTeamName(String teamName);
}
