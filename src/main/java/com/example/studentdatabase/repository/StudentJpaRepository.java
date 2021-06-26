package com.example.studentdatabase.repository;

import com.example.studentdatabase.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentJpaRepository extends JpaRepository<Student, Long> {
    public Student findByName(String name);
}
