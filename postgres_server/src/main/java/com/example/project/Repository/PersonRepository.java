package com.example.project.Repository;

import com.example.project.Entity.person.PersonDetails;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<PersonDetails, Long> {

    @Query("SELECT p FROM PersonDetails p")
    Page<PersonDetails> findPerson(Pageable pageable);

    @Query("SELECT p FROM PersonDetails p  where  p.personMalId=:id")
    List<PersonDetails> findPersonById(Long id);

    @Query("SELECT p FROM PersonDetails p  where  p.name=:name")
    List<PersonDetails> findPersonByName(String name);
}
