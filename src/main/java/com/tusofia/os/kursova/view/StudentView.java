package com.tusofia.os.kursova.view;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tusofia.os.kursova.entities.Student;

public class StudentView {
    //------------------------
    //Members
    //------------------------
    @JsonProperty(value = "id", required = true)
    private Long id;
    @JsonProperty(value = "name")
    private String name;

    //------------------------
    //Initialization
    //------------------------
    public StudentView(Student student) {
        this.id = student.getId();
        this.name = student.getName();
    }

    //------------------------
    //Getters and Setters
    //------------------------
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
