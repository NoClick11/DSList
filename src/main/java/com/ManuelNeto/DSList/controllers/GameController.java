package com.ManuelNeto.DSList.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ManuelNeto.DSList.services.GameService;
import com.ManuelNeto.DSList.dto.GameMinDTO;
import com.ManuelNeto.DSList.entities.Game;

@RestController
@RequestMapping(value= "/games")
public class GameController {

	@Autowired
	private GameService gameService;
 	
	@GetMapping
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> result = gameService.findAll();
		return result;	
	}
}
