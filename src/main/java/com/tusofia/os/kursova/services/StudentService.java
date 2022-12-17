package com.tusofia.os.kursova.services;

import com.tusofia.os.kursova.daos.StudentDao;
import com.tusofia.os.kursova.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentDao dataAcess;

    public List<Student> getAllStudents(){
        return dataAcess.getAllStudents();
    }
}
