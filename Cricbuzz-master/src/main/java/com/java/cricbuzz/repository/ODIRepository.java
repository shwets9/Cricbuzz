package com.java.cricbuzz.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.java.cricbuzz.model.ODI;

public interface ODIRepository extends MongoRepository<ODI, String>{

}
