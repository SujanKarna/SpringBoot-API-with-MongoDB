package com.example.demo.dto;



import com.example.demo.model.Education;
import com.example.demo.model.Gender;
import com.example.demo.model.MaritalStatus;
import jakarta.validation.constraints.*;
import lombok.Data;
import jakarta.validation.constraints.NotBlank;

@Data
public class PersonRequestDto {
    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @Min(0)
    @Max(120)
    private int age;

    @Email
    @NotBlank
    private String email;

    @NotNull
    private Gender gender;

    @NotNull
    private String education;

    @Min(0)
    private int salary;

    @NotNull
    private MaritalStatus maritalStatus;
}
