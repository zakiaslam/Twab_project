package com.example.project.Repository;

import com.example.project.Entity.Anime.Details;
import com.example.project.Entity.character.Characters;
import com.example.project.Entity.person.PersonDetails;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AnimeRepository extends JpaRepository<Details, Long> {
    @Query("SELECT distinct d FROM Details d order by d.rank")
    Page<Details> findAnime(Pageable pageable);
//
    @Query("SELECT d FROM Details d  where  d.malId=:id")
    List<Details> findAnimeById(Long id);

    @Query("SELECT d FROM Details d  where  d.title=:title")
    List<Details> FindAnimeByTitle(String title);
//
//    @Query("SELECT d FROM Details d  where  d.title=:title")
//    List<Details> findAnimeByName(String title);
}
