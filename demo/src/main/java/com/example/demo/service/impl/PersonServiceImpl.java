package com.example.demo.service.impl;

import com.example.demo.dto.PersonRequestDto;
import com.example.demo.dto.PersonResponseDto;
import com.example.demo.exception.EmailAlreadyExistsException;
import com.example.demo.exception.PersonNotFoundException;
import com.example.demo.mapper.PersonMapper;
import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import com.example.demo.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {


    private final PersonRepository personRepository;
    private final PersonMapper personMapper;


    @Override
    public PersonResponseDto create(PersonRequestDto request) {
        if(personRepository.existsByEmail(request.getEmail())) {
            throw new EmailAlreadyExistsException(request.getEmail());
        }
        Person person = new Person();
        person = personMapper.ToEntity(request);
        Person saved = personRepository.save(person);
        return personMapper.ToDto(saved);
    }

    @Override
    public PersonResponseDto getById(String id) {
        Person person = personRepository.findById(id).orElseThrow(()-> new PersonNotFoundException(id));
        return personMapper.ToDto(person);
    }

    @Override
    public Page<PersonResponseDto> getAll(Pageable pageable) {
        return personRepository.findAll(pageable).map(personMapper::ToDto);
    }

    @Override
    public PersonResponseDto update(String id, PersonRequestDto request) {
        Person person = personRepository.findById(id).orElseThrow(()-> new PersonNotFoundException(id));
        if(!person.getEmail().equals(request.getEmail()) && personRepository.existsByEmail(request.getEmail())) {
            throw new EmailAlreadyExistsException(request.getEmail());
        }
        personMapper.updateEntity(person, request);
        Person updated = personRepository.save(person);
        return personMapper.ToDto(updated);

    }

    @Override
    public void delete(String id) {
        if (!personRepository.existsById(id)) {
            throw new PersonNotFoundException(id);
        }
        personRepository.deleteById(id);
    }
}
