package com.mohan.mongo_db_practice.repository;

import com.mohan.mongo_db_practice.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PersonRepository extends MongoRepository<Person, String> {

    List<Person> findByName(String name);
}
