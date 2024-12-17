package com.project.control.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;


@Setter
@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    private String name;
    private String email;
    private String dateNaissance;
}
