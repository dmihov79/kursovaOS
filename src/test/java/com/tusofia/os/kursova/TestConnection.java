package com.tusofia.os.kursova;

import com.tusofia.os.kursova.entities.Student;
import com.tusofia.os.kursova.repositories.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK,
        classes = KursovaApplication.class)
@TestPropertySource(
        locations = "classpath:application.properties")
public class TestConnection {
    @Autowired
    DataSource connection;
    @Autowired
    StudentRepository repository;
    @Test
    public void testConnection(){
        assertNotNull(connection);
    }

    @Test
    public void fillDatabaseWithStudents(){
        List<Student> list = new ArrayList<>();
        list.add(new Student(1L, "Ivan"));
        list.add(new Student(2L, "Damyan"));
        list.add(new Student(3L,"Joro"));
        list.forEach(student -> repository.save(student));
        assertEquals(repository.findAll().size(), 3);
    }
}
