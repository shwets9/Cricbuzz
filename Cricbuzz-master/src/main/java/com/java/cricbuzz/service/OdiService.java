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

import com.java.cricbuzz.model.ODI;
import com.java.cricbuzz.model.Test;

@Service
public class OdiService {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	final Pageable pageableRequest = new PageRequest(0, 10);

	
	public List<ODI> getOdiBowlers()
	{
		Query query = new Query();
		query.addCriteria(Criteria.where("odiCategory").is("Bowler")).with(new Sort(Sort.Direction.DESC,"odiRating")).with(pageableRequest);
		List<ODI> odiBowlers=mongoTemplate.find(query, ODI.class);
		return odiBowlers;
	}
	
	public List<ODI> getOdiBatsmen()
	{
		Query query = new Query();
		query.addCriteria(Criteria.where("odiCategory").is("Batsmen")).with(new Sort(Sort.Direction.DESC,"odiRating")).with(pageableRequest);
		List<ODI> odiBatsmen=mongoTemplate.find(query, ODI.class);
		return odiBatsmen;
	}
	
	public List<ODI> getOdiAllRounder()
	{
		Query query = new Query();
		query.addCriteria(Criteria.where("odiCategory").is("All-Rounder")).with(new Sort(Sort.Direction.DESC,"odiRating")).with(pageableRequest);
		List<ODI> odiAllRounder=mongoTemplate.find(query, ODI.class);
		return odiAllRounder;
	}


}
