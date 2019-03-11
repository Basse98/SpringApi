package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PeopleController {

    //@Autowired
    private PeopleService peopleService;

    public PeopleController(PeopleService service) {
    this.peopleService = service;
    }

    @RequestMapping(value = "/people")
    public List<Person> getAllPeople(){
        return peopleService.getAllPeople();
    }

    @RequestMapping(value = "/people/{input}")
    public Person getPerson(@PathVariable("input") int id){
        return peopleService.getPerson(id);
    }

    @RequestMapping(value = "/people",method = RequestMethod.POST)
    public void addPerson(@RequestBody Person person){
        peopleService.addPerson(person);
    }

    @RequestMapping(value = "/people/{id}",method = RequestMethod.PUT)
    public void updatePerson(@RequestBody Person person, @PathVariable int id){
        peopleService.updatePerson(id,person);
    }

    @RequestMapping(value = "/people/{input}",method = RequestMethod.DELETE)
    public void  deletePerson(@PathVariable("input") int id){
        peopleService.deletePerson(id);
    }

}
