package com.coelho.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coelho.dsmovie.entities.Score;
import com.coelho.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
