package com.tusofia.os.kursova.controller;

import com.tusofia.os.kursova.entities.Student;
import com.tusofia.os.kursova.services.StudentService;
import com.tusofia.os.kursova.view.StudentView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/students")
    public List<StudentView> getAllStudents(){
        List<Student> students= studentService.getAllStudents();
        List<StudentView> studentsJson = new ArrayList<>();
        students.forEach(student -> studentsJson.add(new StudentView(student)));
        return studentsJson;
    }
}
