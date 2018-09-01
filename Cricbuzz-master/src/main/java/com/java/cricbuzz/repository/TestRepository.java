package com.java.cricbuzz.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.java.cricbuzz.model.Test;

public interface TestRepository extends MongoRepository<Test, String>{

}
