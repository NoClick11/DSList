package com.ManuelNeto.DSList.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ManuelNeto.DSList.dto.GameListDTO;
import com.ManuelNeto.DSList.dto.GameMinDTO;
import com.ManuelNeto.DSList.dto.ReplacementDTO;
import com.ManuelNeto.DSList.services.GameListService;
import com.ManuelNeto.DSList.services.GameService;

@RestController
@RequestMapping(value= "/lists")
public class GameListController {

	@Autowired
	private GameService gameService;
	
	@Autowired
	private GameListService gameListService;
 	
	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = gameListService.findAll();
		return result;	
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> FindByList(@ PathVariable Long listId) {
		List<GameMinDTO> result = gameService.findByList(listId);	
		return result;
	}
	
	@PostMapping(value = "/{listId}/replacement")
	public void Move(@ PathVariable Long listId, @RequestBody ReplacementDTO body) {
		gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());	
	}
	
}
