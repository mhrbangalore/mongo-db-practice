package com.mohan.mongo_db_practice.service;

import com.mohan.mongo_db_practice.model.Person;
import com.mohan.mongo_db_practice.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public List<Person> getAllPersons(){
        return repository.findAll();
    }

    public Person addPerson(Person newPerson){
        return repository.save(newPerson);
    }

    public Optional<Person> findById(String id){
        return repository.findById(id);
    }

    public void deletePersonById(String id){
        repository.deleteById(id);
    }

    public List<Person> findByName(String name){
        return repository.findByName(name);
    }

}
