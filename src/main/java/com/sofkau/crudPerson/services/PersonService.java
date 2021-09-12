package com.sofkau.crudPerson.services;


import com.sofkau.crudPerson.entities.Person;
import com.sofkau.crudPerson.repository.InterfacePersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//implemnetacion de interface
@Service
public final class PersonService implements PersonServiceInterface {

    //Definir instacia del repositorio DB

    @Autowired
    private InterfacePersonRepository data;


    @Override
    public List<Person> getAll() {
        //Castear el dato
        return (List<Person>) data.findAll();
    }

    @Override
    public Optional<Person> findById(int id) {
        Person person = data.findById(id).orElse(null);
        if (person == null) throw new IllegalArgumentException("No existe persona con el id: " + id);
        return data.findById(id);
    }

    @Override
    public Person create(Person person) {
        if (person.getName() == "" || person.getName() == null) throw new IllegalArgumentException("El nombre no puede estar vacio");
        if (person.getAge() == "" || person.getAge() == null) throw new IllegalArgumentException("La edad no puede estar vacia");
        return data.save(person);
    }

    @Override
    public void delete(int id) {
        if (data.findById(id).isPresent()) {
            data.deleteById(id);
            System.out.println("Se borró correctamente la persona con el número de id "+ id);

        } else
            throw new IllegalArgumentException("¡Persona no encontrada!!!  con el id " + id);

    }

    @Override
    public Person update(Person person) {
       if ((data.findById(person.getId()).orElse(null) == null)) throw new IllegalArgumentException("NO existe persona a editar");
           if (person.getName() == "" || person.getName() == null) throw new IllegalArgumentException("El nombre no puede estar vacío");
           if (person.getAge() == "" || person.getAge() == null) throw new IllegalArgumentException("La edad no puede estar vacía");
       else
        return data.save(person);

    }
}