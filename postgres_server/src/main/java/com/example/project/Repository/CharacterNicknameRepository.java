package com.example.project.Repository;

import com.example.project.Entity.CharacterNickname;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//@Repository
//public interface CharacterNicknameRepository extends JpaRepository<CharacterNickname, Long> {
//    Optional<CharacterNickname> findByCharacterId(Long characterId);
//}

public interface CharacterNicknameRepository extends JpaRepository<CharacterNickname, Long> {

    @Query("SELECT cn FROM CharacterNickname cn LEFT JOIN FETCH cn.character")
    List<CharacterNickname> findAllWithCharacter();
}


