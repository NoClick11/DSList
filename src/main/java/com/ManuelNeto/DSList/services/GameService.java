package com.ManuelNeto.DSList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ManuelNeto.DSList.dto.GameMinDTO;
import com.ManuelNeto.DSList.entities.Game;
import com.ManuelNeto.DSList.repositories.GameRepository;

@Service
public class GameService {
 
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
