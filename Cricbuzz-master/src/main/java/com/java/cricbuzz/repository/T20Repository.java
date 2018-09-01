package com.java.cricbuzz.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.java.cricbuzz.model.T20;

public interface T20Repository extends MongoRepository<T20, String> {

}