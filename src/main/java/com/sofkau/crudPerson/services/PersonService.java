package com.sofkau.crudPerson.services;


import com.sofkau.crudPerson.entities.Person;
import com.sofkau.crudPerson.repository.InterfacePersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//implemnetacion de interface
@Service
public final class PersonService implements PersonServiceInterface{

    //Definir instacia del repositorio DB

    @Autowired
    private InterfacePersonRepository data;


    @Override
    public List<Person> getAll() {
        //Castear el dato
        return (List<Person>) data.findAll();
    }

    @Override
    public Person getId(int id) {
        return null;
    }

    @Override
    public Person create(Person person) {
        return data.save(person);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Person update(Person person) {
        return null;
    }
}
