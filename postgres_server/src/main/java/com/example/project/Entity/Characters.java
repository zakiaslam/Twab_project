package com.example.project.Entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "characters")
public class Characters {

    @Id
    @Column(name = "character_mal_id")
    private Long characterId;

    private String url;
    private String name;

    @Column(name = "name_kanji")
    private String nameKanji;

    private String image;
    private Long favorites;

    @Column(columnDefinition = "TEXT")
    private String about;

    @OneToMany(
            mappedBy = "character",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    @JsonManagedReference
    private Set<CharacterNickname> nicknames = new HashSet<>();


    @OneToMany(
            mappedBy = "character",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    @JsonManagedReference
    private Set<CharacterAnimeWorks> animeWorks = new HashSet<>();

    public Long getCharacterId() {
        return characterId;
    }

    public void setCharacterId(Long characterId) {
        this.characterId = characterId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameKanji() {
        return nameKanji;
    }

    public void setNameKanji(String nameKanji) {
        this.nameKanji = nameKanji;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getFavorites() {
        return favorites;
    }

    public void setFavorites(Long favorites) {
        this.favorites = favorites;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Set<CharacterNickname> getNicknames() {
        return nicknames;
    }

    public void setNicknames(Set<CharacterNickname> nicknames) {
        this.nicknames = nicknames;
    }

    public Set<CharacterAnimeWorks> getAnimeWorks() {
        return animeWorks;
    }

    public void setAnimeWorks(Set<CharacterAnimeWorks> animeWorks) {
        this.animeWorks = animeWorks;
    }
}


