package com.mancala.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mancala.backend.datamodels.MancalaGame;
import com.mancala.backend.repository.GameRepository;

@Service
public class GameService {
	@Autowired
    private GameRepository gameRepository;
	
	
	
    public GameService() {
		super();
		// TODO Auto-generated constructor stub
	}



	//@Override
	/*
	 * This method will load up at game load.
	 */
    public MancalaGame initialGameLoad() {
    	MancalaGame game = new MancalaGame();
    	gameRepository.save(game);
    	System.out.println("Game successfully loaded and db created.");
		//game.show();
    	
    	return game;
    }

}

