package com.example.project.services;


import com.example.project.Entity.character.Characters;
import com.example.project.Entity.person.PersonDetails;
import com.example.project.Repository.CharactersRepository;
import com.example.project.Repository.PersonRepository;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    public List<PersonDetails> getPersonById(Long Id) {
        return personRepository.findPersonById(Id);
    }
    public List<PersonDetails> getPersonByName(String name) {
        return personRepository.findPersonByName(name);
    }
}