package com.mancala.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mancala.backend.datamodels.MancalaGame;
import com.mancala.backend.datamodels.Player;
import com.mancala.backend.repository.GameRepository;

@Service
public class GamePlayService {
	
	@Autowired
    private GameRepository gameRepository;

	public GamePlayService() {
		super();
	}
	
	public void playerMove(MancalaGame game, int selectedPitId) {
		
		//Use case 1: First move - both player have status as N
		
		if(isActive(game.getPlayerA()) && isActive(game.getPlayerB())) {
			game.getPlayerA().setActive('Y');
			return;
		}
		
		//Use case 2: Active player selects pit of inactive player.
		if(game.getPlayerA().getActive()=='N') {
			
		}
		//Use case 3: Active player selects its own pit and does not end in capture or big pit
		//Use case 4: Active player selects its own pit and ends in big pit
		//Use case 5: Active player selects its own pit and ends in capture. 
		//Use case 6: One side is completely out of stones. 
		
	}
	
	public boolean isActive(Player player) {
		if(player.getActive()=='Y') { return true; }
		return false;
	}

}
