package com.example.project.services;


import com.example.project.Entity.person.PersonDetails;
import com.example.project.Repository.CharactersRepository;
import com.example.project.Repository.PersonRepository;

import org.springframework.stereotype.Service;


@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
}