package com.tusofia.os.kursova.daos;

import com.tusofia.os.kursova.entities.Student;
import com.tusofia.os.kursova.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentDao {
    @Autowired
    private StudentRepository repository;

    public List<Student> getAllStudents(){
        return repository.findAll();
    }
}
