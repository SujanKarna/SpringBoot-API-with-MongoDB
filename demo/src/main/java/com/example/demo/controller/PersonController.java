package com.example.demo.controller;


import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/people")
public class PersonController {
    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping
    public List<Person> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> getById(@PathVariable String id) {
        Person p = service.getById(id);
        return p == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(p);
    }

    @PostMapping
    public Person create(@RequestBody Person p) {
        return service.create(p);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Person> update(@PathVariable String id, @RequestBody Person p) {
        Person updated = service.update(id, p);
        return updated == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }


}
