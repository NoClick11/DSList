package com.ManuelNeto.DSList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ManuelNeto.DSList.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
