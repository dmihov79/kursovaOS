package com.tusofia.os.kursova.repositories;

import com.tusofia.os.kursova.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
