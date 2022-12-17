package com.tusofia.os.kursova.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "student")
public class Student {
    //------------------------
    //Members
    //------------------------
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    //------------------------
    //Initialization
    //------------------------
    public Student() {
    }

    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    //------------------------
    //Getters and Setters
    //------------------------
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
