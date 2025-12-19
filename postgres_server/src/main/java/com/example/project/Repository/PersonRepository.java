package com.example.project.Repository;

import com.example.project.Entity.person.PersonDetails;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonDetails, Long> {

    @Query("SELECT c FROM PersonDetails c")
    Page<PersonDetails> findAll(Pageable pageable);
}
