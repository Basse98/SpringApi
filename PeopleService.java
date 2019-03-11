package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PeopleService {

    @Autowired
    private PersonRepository personRepository;

    List<Person> people = new ArrayList<>(Arrays.asList(
            new Person(1,19,"Oskar"),
            new Person(2,20,"Basse"),
            new Person(3,18,"Monika")
    ));

    public List<Person> getAllPeople(){
        //return people;
        List<Person> list = new ArrayList<>();
        personRepository.findAll().forEach(list::add);
        return list;
    }


    public Person getPerson(int id){
        //return people.stream().filter(i->i.getId() == id).findFirst().get();
        Person p = personRepository.findById(id).get();
        return p;
    }


    public void addPerson(Person person) {
        //people.add(person);
        personRepository.save(person);
    }


    public void updatePerson(int id, Person person) {
        /*for (int i = 0; i < people.size(); i++) {
            Person p = people.get(i);
            if(p.getId() == id){
                people.set(i,person);
                return;
            }
        }
        */
        personRepository.save(person);
    }


    public void close() {

    }



    public void deletePerson(int id) {
        //people.removeIf(c -> c.getId() == id);
        personRepository.deleteById(id);
    }



}
