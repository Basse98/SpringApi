package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PeopleService {

    List<Person> people = Arrays.asList(
            new Person(1,19,"Oskar"),
            new Person(2,20,"Basse"),
            new Person(3,18,"Monika")
    );

    public List<Person> getAllPeople(){
        return people;
    }

}
