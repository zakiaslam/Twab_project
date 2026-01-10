package com.example.project.Entity.person;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name="person_anime_works")
public class PersonAnimeWorks {

    @Id
    @Column(name="person_mal_id")
    private Long PAWid;

    private String position;

    @Column(name="anime_mal_id")
    private Long AnimeId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_mal_id", nullable = false)
    @MapsId // <- this tells Hibernate "id is mapped through the relationship"
    @JsonBackReference
    private PersonDetails person;

    public Long getPAWid() {
        return PAWid;
    }

    public void setPAWid(Long PAWid) {
        this.PAWid = PAWid;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Long getAnimeId() {
        return AnimeId;
    }

    public void setAnimeId(Long animeId) {
        AnimeId = animeId;
    }

    public PersonDetails getPerson() {
        return person;
    }

    public void setPerson(PersonDetails person) {
        this.person = person;
    }
}
