package com.example.project.services;

import com.example.project.Entity.Anime.Details;
import com.example.project.Entity.person.PersonDetails;
import com.example.project.Repository.PersonRepository;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;



    @Service
    public class AnimeService {

        private final AnimeService animeService;

        public AnimeService(@Lazy AnimeService animeService) {
            this.animeService = animeService;
        }

//        public List<Details> getAnimeById(Long Id) {
//            return animeService.findAnimeById(Id);
//        }
//
//        public List<Details> getAnimeByName(String name) {
//            return animeService.findAnimeByName(name);
//        }

    }