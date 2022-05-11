package com.coelho.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coelho.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
