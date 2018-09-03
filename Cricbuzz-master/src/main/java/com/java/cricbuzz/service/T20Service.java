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

import com.java.cricbuzz.model.T20;

@Service
public class T20Service {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	final Pageable pageableRequest = new PageRequest(0, 10);
	
	public List<T20> getT20Bowlers()
	{
		Query query = new Query();
		query.addCriteria(Criteria.where("t20Category").is("Bowler")).with(new Sort(Sort.Direction.DESC,"t20Rating")).with(pageableRequest);
		List<T20> t20Bowlers=mongoTemplate.find(query, T20.class);
		return t20Bowlers;
	}
	
	public List<T20> getT20Batsmen()
	{
		Query query = new Query();
		query.addCriteria(Criteria.where("t20Category").is("Batsmen")).with(new Sort(Sort.Direction.DESC,"t20Rating")).with(pageableRequest);
		List<T20> t20Batsmen=mongoTemplate.find(query, T20.class);
		return t20Batsmen;
	}
	
	public List<T20> getT20AllRounder()
	{
		Query query = new Query();
		query.addCriteria(Criteria.where("t20Category").is("All-Rounder")).with(new Sort(Sort.Direction.DESC,"t20Rating")).with(pageableRequest);
		List<T20> t20AllRounder=mongoTemplate.find(query, T20.class);
		return t20AllRounder;
	}

}
