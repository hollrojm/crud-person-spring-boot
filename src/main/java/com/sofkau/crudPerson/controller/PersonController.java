package com.sofkau.crudPerson.controller;

import com.sofkau.crudPerson.entities.Person;
import com.sofkau.crudPerson.services.PersonServiceInterface;
import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController // Indica que esta clase va a contener los metodos read put delete para consumir los servicios.
@RequestMapping("api") // Opcion para indentificar o establece de la url de nuetra api
public final class PersonController {



    @Autowired // crear variable
    private PersonServiceInterface servicePerson; //Instacia de la interface

    @GetMapping(value = "/personList")
    public Iterable<Person>getPersons(){
        return servicePerson.getAll();
    }

    @PostMapping(value = "/createPerson")
    //@RequestBody es la que nos da la información que viene por parametro a traves de POST

    public Person createPerson(@RequestBody Person person){
        return servicePerson.create(person);

    }
    @GetMapping(value = "/person/{id}")
    public Optional<Person> getPerson(@PathVariable int id) throws NoSuchFieldException {
          return servicePerson.findById(id);

    }
    @DeleteMapping(value = "/deletePerson/{id}")
    public void deletePerson(@PathVariable int id) {
        servicePerson.delete(id);
        System.out.println("Registro eliminado correctamente");
    }
    @PutMapping(value = "/updatePerson")
    public void UpdatePerson(@RequestBody Person person) {servicePerson.update(person);}


}
