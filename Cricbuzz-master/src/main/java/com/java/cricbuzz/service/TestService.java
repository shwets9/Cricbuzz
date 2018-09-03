package com.java.cricbuzz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.java.cricbuzz.model.Test;

@Service
public class TestService {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	final Pageable pageableRequest = new PageRequest(0, 10);
	
	public List<Test> getTestBowlers()
	{
		Query query = new Query();
		query.addCriteria(Criteria.where("testCategory").is("Bowler")).with(new Sort(Sort.Direction.DESC,"testRating")).with(pageableRequest);
		List<Test> testBowlers=mongoTemplate.find(query, Test.class);
		return testBowlers;
	}
	
	public List<Test> getTestBatsmen()
	{
		Query query = new Query();
		query.addCriteria(Criteria.where("testCategory").is("Batsmen")).with(new Sort(Sort.Direction.DESC,"testRating")).with(pageableRequest);
		List<Test> testBatsmen=mongoTemplate.find(query, Test.class);
		return testBatsmen;
	}
	
	public List<Test> getTestAllRounder()
	{
		Query query = new Query();
		query.addCriteria(Criteria.where("testCategory").is("All-Rounder")).with(new Sort(Sort.Direction.DESC,"testRating")).with(pageableRequest);
		List<Test> testAllRounder=mongoTemplate.find(query, Test.class);
		return testAllRounder;
	}

}
