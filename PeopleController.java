package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PeopleController {

    @RequestMapping(value = "/people")
    public List<Person> getAllPeople(){
        return Arrays.asList(
                new Person(1,19,"Oskar"),
                new Person(2,20,"Basse"),
                new Person(3,18,"Monika")
        );
    }

    

}
