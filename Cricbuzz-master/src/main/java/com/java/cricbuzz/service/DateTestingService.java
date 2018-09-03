package com.java.cricbuzz.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.java.cricbuzz.model.DateTesting;
import com.java.cricbuzz.repository.DateTestingRepository;

@Service
public class DateTestingService {
	
	@Autowired
	private DateTestingRepository dateTestingRepository;
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public List<DateTesting> getAllDate()
	{
		Query query= new Query();
		query.addCriteria(Criteria.where("date").is(new Date(1996,03,07)));
		List<DateTesting> dateTestingList = mongoTemplate.find(query,DateTesting.class);
		return dateTestingList;
		
	}

}
