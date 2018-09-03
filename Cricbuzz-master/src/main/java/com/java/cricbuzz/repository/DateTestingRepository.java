package com.java.cricbuzz.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.java.cricbuzz.model.DateTesting;

public interface DateTestingRepository extends MongoRepository<DateTesting, String>{

}
