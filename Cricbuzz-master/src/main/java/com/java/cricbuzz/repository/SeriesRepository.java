package com.java.cricbuzz.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.java.cricbuzz.model.Series;

public interface SeriesRepository extends MongoRepository<Series, String> {

}
