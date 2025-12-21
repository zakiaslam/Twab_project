package com.example.project.Entity.person;


import com.example.project.Entity.character.CharacterNickname;
import com.example.project.Entity.character.PersonVoiceWorks;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="person_details")
public class PersonDetails {

    @Id
    @Column(name = "person_mal_id")
    private Long personMalId;

    @Column(name = "url", columnDefinition = "text")
    private String url;

    @Column(name = "website_url", columnDefinition = "text")
    private String websiteUrl;

    @Column(name = "image_url", columnDefinition = "text")
    private String imageUrl;

    @Column(name = "name", columnDefinition = "text")
    private String name;

    @Column(name = "given_name", columnDefinition = "text")
    private String givenName;

    @Column(name = "family_name", columnDefinition = "text")
    private String familyName;

    @Column(name = "birthday", columnDefinition = "text")
    private String birthday;

    @Column(name = "favorites")
    private Long favorites;

    @Column(name = "relevant_location", columnDefinition = "text")
    private String relevantLocation;



    @OneToMany(
            mappedBy = "person",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    @JsonManagedReference
    private Set<PersonAlternateNames> personAlternateNames = new HashSet<>();

    @OneToMany(
            mappedBy = "person",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    @JsonManagedReference
    private Set<PersonAnimeWorks> personAnimeWorks = new HashSet<>();

    @OneToMany(
            mappedBy = "person",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    @JsonManagedReference
    private Set<PersonVoiceWorks> personVoiceWorks = new HashSet<>();

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public Long getPersonMalId() {
        return personMalId;
    }

    public void setPersonMalId(Long personMalId) {
        this.personMalId = personMalId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Long getFavorites() {
        return favorites;
    }

    public void setFavorites(Long favorites) {
        this.favorites = favorites;
    }

    public String getRelevantLocation() {
        return relevantLocation;
    }

    public void setRelevantLocation(String relevantLocation) {
        this.relevantLocation = relevantLocation;
    }

    public Set<PersonAlternateNames> getPersonAlternateNames() {
        return personAlternateNames;
    }

    public void setPersonAlternateNames(Set<PersonAlternateNames> personAlternateNames) {
        this.personAlternateNames = personAlternateNames;
    }

    public Set<PersonAnimeWorks> getPersonAnimeWorks() {
        return personAnimeWorks;
    }

    public void setPersonAnimeWorks(Set<PersonAnimeWorks> personAnimeWorks) {
        this.personAnimeWorks = personAnimeWorks;
    }

    public Set<PersonVoiceWorks> getPersonVoiceWorks() {
        return personVoiceWorks;
    }

    public void setPersonVoiceWorks(Set<PersonVoiceWorks> personVoiceWorks) {
        this.personVoiceWorks = personVoiceWorks;
    }
}
