package com.example.project.ToDo;

import jakarta.persistence.Column;

public class PersonToDo {


    private Long personMalId;
    private String url;
    private String websiteUrl;
    private String imageUrl;
    private String name;
    private String givenName;
    private String familyName;
    private String birthday;
    private Long favorites;
    private String relevantLocation;

    public PersonToDo(Long personMalId, String url, String websiteUrl, String imageUrl, String name, String givenName, String familyName, String birthday, Long favorites, String relevantLocation) {
        this.personMalId = personMalId;
        this.url = url;
        this.websiteUrl = websiteUrl;
        this.imageUrl = imageUrl;
        this.name = name;
        this.givenName = givenName;
        this.familyName = familyName;
        this.birthday = birthday;
        this.favorites = favorites;
        this.relevantLocation = relevantLocation;
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

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
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
}
