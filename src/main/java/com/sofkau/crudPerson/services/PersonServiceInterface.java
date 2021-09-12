package com.sofkau.crudPerson.services;

import com.sofkau.crudPerson.entities.Person;

import java.util.List;

//definimos los metodos a los cuales el controlador puede acceder
public interface PersonServiceInterface {

    public List<Person> getAll();
    public Person getId(int id );
    public Person create(Person person);
    public void delete(int id);
    public Person update(Person person);


}
