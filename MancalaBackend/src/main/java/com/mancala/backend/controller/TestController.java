package com.mancala.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mancala.backend.datamodels.MancalaGame;
import com.mancala.backend.service.GameService;

@Controller
public class TestController {
	
	@Autowired
	private GameService gameService;
	
	@RequestMapping("/")
	public String initialGameLoad()
	{
		System.out.println("Loading Homepage!");
		MancalaGame gameObj = gameService.initialGameLoad();
		
		return "home";
	}

}
