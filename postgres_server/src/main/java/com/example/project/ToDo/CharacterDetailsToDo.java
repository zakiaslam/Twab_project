package com.example.project.ToDo;

public class CharacterDetailsToDo {



        private Long characterId;
        private String characterName;
        private String role;
        private String nickname;
        private String url;
        private String nameKanji;
        private String image;
        private Long favorites;
        private String about;
        private String language;

        public CharacterDetailsToDo(
                Long characterId,

                String characterName,
                String role,
                String nickname,
                String url,
                String nameKanji,
                String image,
                Long favorites,
                String about,
                String language
        ) {

            this.characterId = characterId;

            this.characterName = characterName;
            this.role = role;
            this.nickname = nickname;
            this.url = url;
            this.nameKanji = nameKanji;
            this.image = image;
            this.favorites = favorites;
            this.about = about;
            this.language = language;
        }

        // getters & setters
        public Long getCharacterId() { return characterId; }
        public void setCharacterId(Long characterId) { this.characterId = characterId; }

        public String getCharacterName() { return characterName; }
        public void setCharacterName(String characterName) { this.characterName = characterName; }

        public String getRole() { return role; }
        public void setRole(String role) { this.role = role; }

        public String getNickname() { return nickname; }
        public void setNickname(String nickname) { this.nickname = nickname; }

        public String getUrl() { return url; }
        public void setUrl(String url) { this.url = url; }

        public String getNameKanji() { return nameKanji; }
        public void setNameKanji(String nameKanji) { this.nameKanji = nameKanji; }

        public String getImage() { return image; }
        public void setImage(String image) { this.image = image; }

        public Long getFavorites() { return favorites; }
        public void setFavorites(Long favorites) { this.favorites = favorites; }

        public String getAbout() { return about; }
        public void setAbout(String about) { this.about = about; }
        public String getLanguage() { return language; }
        public void setLanguage(String language) { this.language = language; }
    }
