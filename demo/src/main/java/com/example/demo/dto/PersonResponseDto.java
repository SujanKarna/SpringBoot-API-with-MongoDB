package com.example.demo.dto;

import com.example.demo.model.Education;
import com.example.demo.model.Gender;
import com.example.demo.model.MaritalStatus;
import lombok.Data;

@Data
public class PersonResponseDto {
    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private Gender gender;
    private String education;
    private double salary;
    private MaritalStatus maritalStatus;
}
