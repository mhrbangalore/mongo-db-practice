package com.mohan.mongo_db_practice.controller;

import com.mohan.mongo_db_practice.model.Person;
import com.mohan.mongo_db_practice.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping
    public List<Person> findAllPersonsFromDb(){
        return service.getAllPersons();
    }

    @PostMapping
    public Person addNewPerson(@RequestBody Person person){
        return service.addPerson(person);
    }

    @GetMapping("/{id}")
    public Person findPersonById(@PathVariable("id") String id){
        return service.findById(id).get();
    }

    @GetMapping("/search")
    public List<Person> getPersonByName(@RequestParam String name){
        return service.findByName(name);
    }
}
