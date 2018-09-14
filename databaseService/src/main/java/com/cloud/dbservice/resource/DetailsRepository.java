package com.cloud.dbservice.resource;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cloud.dbservice.model.Details;

@Repository
public interface DetailsRepository extends MongoRepository<Details, ObjectId> {

	public Details findByUsername(String username);
	Details findBy_id(ObjectId _id);

}
