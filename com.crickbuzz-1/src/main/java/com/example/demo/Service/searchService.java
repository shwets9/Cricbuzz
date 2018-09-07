package com.example.demo.Service;

import java.util.List;

import org.springframework.data.mongodb.core.query.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;

import com.example.demo.Reposetory.Repository;
import com.example.demo.model.Search;



@Service
public class searchService {
	@Autowired
	private Repository repository;

	
	
	//Create operation
		public Search create(String playerName,String national_Side,String born,String height,String batting,String bowling,String role,String test_Runs,String odi_Runs,String test_Wickets,String odi_Wickets)
		{
			return repository.save(new Search(playerName, national_Side, born, height,batting,bowling,role,test_Runs,odi_Runs,test_Wickets,odi_Wickets));
		}
	
	public List<Search> getAllSearch()
	{
		return repository.findAll();
	}
	
	public Search getSearch(String playerName)
	{
		return repository.findByPlayerName(playerName);
	}
	
}

