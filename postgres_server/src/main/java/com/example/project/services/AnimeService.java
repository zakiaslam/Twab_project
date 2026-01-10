package com.example.project.services;


import com.example.project.Entity.Anime.Details;
import com.example.project.Repository.AnimeRepository;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;



    @Service
    public class AnimeService {

        private AnimeRepository animeRepository;


//        public AnimeService(@Lazy AnimeService animeService) {
//            this.animeService = animeService;
//        }


        public AnimeService( AnimeRepository animeRepository) {

            this.animeRepository = animeRepository;
        }

        public List<Details> getAnimeById(Long Id) {
            return animeRepository.findAnimeById(Id);
        }
      public List<Details> getAnimeByTitle(String title) {
        return animeRepository.FindAnimeByTitle(title);
    }
//        public List<Details> getAnimeByName(String name) {
//            return animeService.findAnimeByName(name);
//        }

    }