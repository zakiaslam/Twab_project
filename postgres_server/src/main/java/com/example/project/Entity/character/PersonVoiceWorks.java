package com.example.project.Entity.character;

import com.example.project.Entity.person.PersonDetails;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name="person_voice_works")
public class PersonVoiceWorks {

    @Id
    @Column(name = "character_mal_id", insertable = false, updatable = false)
    private Long PVWId;

    @Column(name="person_mal_id", insertable = false, updatable = false)
    private Long personMalId;
    private String role;
    @Column(name="anime_mal_id")
    private Long animeMalId;
    private String language;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "character_mal_id", nullable = false)
    @JsonBackReference
    private Characters character;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_mal_id", nullable = false)
    @JsonBackReference
    private PersonDetails person;

    public Long getPVWId() {
        return PVWId;
    }

    public void setPVWId(Long PVWId) {
        this.PVWId = PVWId;
    }

    public Long getPersonMalId() {
        return personMalId;
    }

    public void setPersonMalId(Long personMalId) {
        this.personMalId = personMalId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getAnimeMalId() {
        return animeMalId;
    }

    public void setAnimeMalId(Long animeMalId) {
        this.animeMalId = animeMalId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Characters getCharacter() {
        return character;
    }

    public void setCharacter(Characters character) {
        this.character = character;
    }

    public PersonDetails getPerson() {
        return person;
    }

    public void setPerson(PersonDetails person) {
        this.person = person;
    }
}
