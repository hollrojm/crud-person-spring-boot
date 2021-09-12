package com.sofkau.crudPerson.services;


import com.sofkau.crudPerson.entities.Person;
import com.sofkau.crudPerson.repository.InterfacePersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Optional<Person> findId(int id) {
        return data.findById(id);
    }

    @Override
    public Person create(Person person) {
        return data.save(person);
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }

    @Override
    public Person update(Person person) {
        return null;
    }
}
