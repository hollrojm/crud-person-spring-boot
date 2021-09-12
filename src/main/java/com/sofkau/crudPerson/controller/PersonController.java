package com.sofkau.crudPerson.controller;

import com.sofkau.crudPerson.entities.Person;
import com.sofkau.crudPerson.services.PersonServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController // Indica que esta clase va a contener los metodos read put delete para consumir los servicios.
@RequestMapping("api") // Opcion para indentificar o establece de la url de nuetra api
public final class PersonController {

    @Autowired // crear variable
    private PersonServiceInterface service; //Instacia de la interface

    @GetMapping(value = "/PersonList")
    public Iterable<Person>getPersons(){
        return service.getAll();
    }
    @PostMapping(value = "/CreatePerson")
    //@RequestBody es la que nos da la informacion que viene por parametro a traves de POST
    public Person createPerson(@RequestBody Person person){
        return service.create(person);
    }


}
