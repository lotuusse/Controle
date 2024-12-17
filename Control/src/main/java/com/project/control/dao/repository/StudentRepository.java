package com.project.control.dao.repository;

import com.project.control.dao.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByDateNaissance(String dateNaissance);
}
