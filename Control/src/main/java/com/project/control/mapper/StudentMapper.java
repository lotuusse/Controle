package com.project.control.mapper;

import com.project.control.dao.entity.Student;
import com.project.control.dto.StudentDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    private final ModelMapper modelMapper = new ModelMapper();
    public Student fromStudentDTOToStudent(StudentDTO studentDTO) {
        return modelMapper.map(studentDTO, Student.class);
    }

    public StudentDTO fromStudentToStudentDTO(Student student) {
        return modelMapper.map(student, StudentDTO.class);
    }
}
