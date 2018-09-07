package com.example.demo.Reposetory;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Search;


public interface Repository extends MongoRepository<Search, String>{

			public Search findByPlayerName(String playerName);
}
