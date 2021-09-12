package com.sofkau.crudPerson.repository;

import com.sofkau.crudPerson.entities.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository //definimos como repositorio
//Crudrepositori nos entrega los metodos del crud guardar, guardar varios, buscar por id buscar todos, delete,
public interface InterfacePersonRepository extends CrudRepository<Person, Integer> {


}
