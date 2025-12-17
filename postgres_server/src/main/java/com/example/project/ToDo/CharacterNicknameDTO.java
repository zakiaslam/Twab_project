package com.example.project.ToDo;

public class CharacterNicknameDTO {
    private Long characterId;
    private String nickname;
    private String characterName;
    private String role;

    public CharacterNicknameDTO(Long characterId, String nickname, String characterName, String role) {
        this.characterId = characterId;
        this.nickname = nickname;
        this.characterName = characterName;
        this.role = role;
    }

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

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
// getters and setters
}
