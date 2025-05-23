package com.ManuelNeto.DSList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ManuelNeto.DSList.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
