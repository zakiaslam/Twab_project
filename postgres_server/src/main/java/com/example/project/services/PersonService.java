package com.example.project.services;


import com.example.project.Entity.Characters;
import com.example.project.Entity.PersonDetails;
import com.example.project.Repository.PersonRepository;
import com.example.project.ToDo.CharacterNicknameDTO;
import com.example.project.ToDo.PersonToDo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<PersonToDo> personService(Pageable pageable) {
        Page<PersonDetails> persons = personRepository.findAll(pageable);
        List<PersonToDo> result = new ArrayList<>();

        for (PersonDetails person : persons) {
            result.add(new PersonToDo(
                    person.getPersonMalId(),
                    person.getUrl(),
                    person.getWebsiteUrl(),
                    person.getImageUrl(),
                    person.getName(),
                    person.getGivenName(),
                    person.getFamilyName(),
                    person.getBirthday(),
                    person.getFavorites(),
                    person.getRelevantLocation()

            ));
        }

        return result;
    }


}