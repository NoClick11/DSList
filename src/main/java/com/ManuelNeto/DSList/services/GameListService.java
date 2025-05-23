package com.ManuelNeto.DSList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ManuelNeto.DSList.dto.GameListDTO;
import com.ManuelNeto.DSList.dto.GameMinDTO;
import com.ManuelNeto.DSList.entities.Game;
import com.ManuelNeto.DSList.entities.GameList;
import com.ManuelNeto.DSList.repositories.GameListRepository;

@Service
public class GameListService {
 
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
}
