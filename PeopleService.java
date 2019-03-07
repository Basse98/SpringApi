package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PeopleService {

    List<Person> people = new ArrayList<>(Arrays.asList(
            new Person(1,19,"Oskar"),
            new Person(2,20,"Basse"),
            new Person(3,18,"Monika")
    ));

    public List<Person> getAllPeople(){
        return people;
    }

    public Person getPerson(int id){
        return people.stream().filter(i->i.getId() == id).findFirst().get();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void updatePerson(int id, Person person) {
        for (int i = 0; i < people.size(); i++) {
            Person p = people.get(i);
            if(p.getId() == id){
                people.set(i,person);
                return;
            }
        }
    }

    public void deletePerson(int id) {
        people.removeIf(c -> c.getId() == id);
    }
}
