package com.example.project.Entity.character;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "character_nicknames")
public class CharacterNickname {

    @Id
    @Column(name = "character_mal_id", insertable = false, updatable = false)
    private Long CNId;

    @Column(name = "nickname")
    private String nickname;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "character_mal_id", nullable = false)
    @JsonBackReference
    private Characters character;

    public Long getCNId() {
        return CNId;
    }

    public void setCNId(Long CNId) {
        this.CNId = CNId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Characters getCharacter() {
        return character;
    }

    public void setCharacter(Characters character) {
        this.character = character;
    }
}