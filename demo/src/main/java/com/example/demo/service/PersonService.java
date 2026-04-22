package com.example.demo.service;

import com.example.demo.dto.PersonRequestDto;
import com.example.demo.dto.PersonResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PersonService {
    PersonResponseDto create(PersonRequestDto request);
    PersonResponseDto getById(String id);
    Page<PersonResponseDto> getAll(Pageable pageable);
    PersonResponseDto update(String id, PersonRequestDto request);
    void delete(String id);
}
