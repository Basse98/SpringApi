package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    @RequestMapping(value = "/people")
    public List<Person> getAllPeople(){
        return peopleService.getAllPeople();
    }



}
