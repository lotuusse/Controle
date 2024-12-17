package com.project.control.web;

import com.project.control.dto.StudentDTO;
import com.project.control.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class StudentGraphQLController {
    private StudentService studentService;

    @MutationMapping
    public StudentDTO saveStudent(@Argument StudentDTO student) {
        return studentService.saveStudent(student);
    }

    @QueryMapping
    public List<StudentDTO> getStudentByDateNaissance(@Argument String date) {
        return studentService.getStudentByDateNaissance(date);
    }

}
