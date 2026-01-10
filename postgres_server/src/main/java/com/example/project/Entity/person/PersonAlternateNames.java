package com.example.project.Entity.person;


import com.example.project.Entity.character.Characters;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name="person_alternate_names")
public class PersonAlternateNames {

    @Id
    @Column(name="person_mal_id")
    private Long PANid;
    @Column(name="alt_name")
    private String alternateName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_mal_id", nullable = false)
    @MapsId // <- this tells Hibernate "id is mapped through the relationship"
    @JsonBackReference
    private PersonDetails person;
}
