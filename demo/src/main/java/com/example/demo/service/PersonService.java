package com.example.demo.service;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonRepository repo;

    public PersonService(PersonRepository repo) {
        this.repo = repo;
    }

    public List<Person> getAll() {
        return repo.findAll();
    }

    public Person getById(String id) {
        return repo.findById(id).orElse(null);
    }

    public Person create(Person p) {
        p.setId(null);
        return repo.save(p);
    }

    public Person update(String id, Person p) {
        return repo.findById(id)
                .map(existing -> {
                    existing.setFirstName(p.getFirstName());
                    existing.setLastName(p.getLastName());
                    existing.setAge(p.getAge());
                    existing.setEmail(p.getEmail());
                    return repo.save(existing);
                })
                .orElse(null);
    }

    public void delete(String id) {
        repo.deleteById(id);
    }

}
