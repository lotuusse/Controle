package com.project.control.service;

import com.project.control.dao.entity.Student;
import com.project.control.dao.repository.StudentRepository;
import com.project.control.dto.StudentDTO;
import com.project.control.mapper.StudentMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentManager implements StudentService {
    private StudentRepository studentRepo;
    private StudentMapper studentMapper;


    @Override
    public StudentDTO saveStudent(StudentDTO studentDTO) {
        Student student = studentMapper.fromStudentDTOToStudent(studentDTO);
        student =studentRepo.save(student);
        studentDTO = studentMapper.fromStudentToStudentDTO(student);
        return studentDTO ;
    }

    @Override
    public boolean deleteStudent(Long id) {
        try {
            studentRepo.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public List<StudentDTO> getStudentByDateNaissance(String dateNaissance) {
        List<Student> students = studentRepo.findByDateNaissance(dateNaissance);
        List<StudentDTO> studentDTOS = new ArrayList<>();
        for (Student student : students) {
            studentDTOS.add(studentMapper.fromStudentToStudentDTO(student));
        }
        return studentDTOS;
    }

    @Override
    public List<StudentDTO> saveAllStudents(List<StudentDTO> studentDtos) {

        List<Student> students = new ArrayList<>();
        for (StudentDTO studentDto : studentDtos) {
            students.add(studentMapper.fromStudentDTOToStudent(studentDto));
        }

        students = studentRepo.saveAll(students);

        studentDtos = new ArrayList<>();
        for (Student avion : students) {
            studentDtos.add(studentMapper.fromStudentToStudentDTO(avion));
        }
        return studentDtos;
    }
}




