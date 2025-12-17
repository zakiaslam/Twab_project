package com.example.project.Entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "character_nicknames")
public class CharacterNickname {

    @Id
    @Column(name = "character_mal_id")
    private Long characterId;

    @Column(name = "nickname")
    private String nickname;
    // CharacterNickname.java
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "character_mal_id", insertable = false, updatable = false)
    @JsonBackReference
    private CharacterAnimeWorks character;

    public Long getCharacterId() {
        return characterId;
    }

    public void setCharacterId(Long characterId) {
        this.characterId = characterId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public CharacterAnimeWorks getCharacter() {
        return character;
    }

    public void setCharacter(CharacterAnimeWorks character) {
        this.character = character;
    }
}

