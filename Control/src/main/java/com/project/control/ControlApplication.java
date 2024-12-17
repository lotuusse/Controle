package com.project.control;

import com.project.control.dto.StudentDTO;
import com.project.control.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication
public class ControlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControlApplication.class, args);
    }

    @Bean
    CommandLineRunner start(StudentService studentService) {
        return args -> {
            studentService.saveAllStudents(
                    List.of(
                            StudentDTO.builder().name("Amine").email("amine23-1@gmail.com").dateNaissance("12/05/2003").build(),
                            StudentDTO.builder().name("Samar").email("sam12ar@hotmail.com").dateNaissance("06/03/2002").build(),
                            StudentDTO.builder().name("Rayan").email("ray45@hotmail.fr").dateNaissance("23/04/2003").build(),
                            StudentDTO.builder().name("noor").email("noor176@yahoo.fr").dateNaissance("13/10/2002").build()
                    )
            );
        };
    }
}
