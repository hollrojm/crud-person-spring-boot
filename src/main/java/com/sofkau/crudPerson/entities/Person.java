package com.sofkau.crudPerson.entities;

import org.apache.logging.log4j.message.Message;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity // Definimos como una entidad y queda en la base datos con lso atributos que se definan.
@Table(name="personas")//Bd relacional -> se establece el nombre de la tabla .
public final class Person {

    @Id // importa la libreria de persistencia
    @GeneratedValue(strategy = GenerationType.IDENTITY)//deefinos el id automatico crea el id automatico si no hace parte de la fuencion persona
    private Integer id;
    @NotNull(message = "El nombre no puede ser Nulo")
    @Size(min = 3, message = "El nombre debe tener minimo 3 caracteres")
    private String  name;
    @Column(nullable = false)
    @NotNull(message = "La edad no puede estar vacia")
    private String  age;

    public Person() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
