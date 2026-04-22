package com.example.demo.mapper;

import com.example.demo.dto.PersonRequestDto;
import com.example.demo.dto.PersonResponseDto;
import com.example.demo.model.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {

    public PersonResponseDto ToDto(Person person) {
       PersonResponseDto dto = new PersonResponseDto();
       dto.setId(person.getId());
       dto.setFirstName(person.getFirstName());
       dto.setLastName(person.getLastName());
       dto.setAge(person.getAge());
       dto.setSalary(person.getSalary());
       dto.setMaritalStatus(person.getMaritalStatus());
       dto.setGender(person.getGender());
       dto.setEmail(person.getEmail());
       dto.setEducation(person.getEducation());

       return dto;
    }

    public void updateEntity(Person person, PersonRequestDto dto) {
        person.setFirstName(dto.getFirstName());
        person.setLastName(dto.getLastName());
        person.setAge(dto.getAge());
        person.setEmail(dto.getEmail());
        person.setGender(dto.getGender());
        person.setEducation(dto.getEducation());
        person.setSalary(dto.getSalary());
        person.setMaritalStatus(dto.getMaritalStatus());
    }

    public Person ToEntity(PersonRequestDto personRequestDto) {
        Person person = new Person();
        person.setFirstName(personRequestDto.getFirstName());
        person.setLastName(personRequestDto.getLastName());
        person.setMaritalStatus(personRequestDto.getMaritalStatus());
        person.setGender(personRequestDto.getGender());
        person.setEmail(personRequestDto.getEmail());
        person.setEducation(personRequestDto.getEducation());
        person.setSalary(personRequestDto.getSalary());
        person.setAge(personRequestDto.getAge());

        return person;
    }
}
