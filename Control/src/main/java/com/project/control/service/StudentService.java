package com.project.control.service;

import com.project.control.dto.StudentDTO;

import java.util.List;

public interface StudentService {
    public StudentDTO saveStudent(StudentDTO studentDTO);
    public boolean deleteStudent(Long id);
    public List<StudentDTO> getStudentByDateNaissance(String dateNaissance);
    public List<StudentDTO> saveAllStudents(List<StudentDTO> studentDtos);

}
