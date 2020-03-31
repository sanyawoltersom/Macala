package com.mancala.backend.datamodels;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

//@Document(collection="game")
public class MancalaGame {
	
	/*
	 * Id, Player Turn, list/map of pits by each player, current_pit index;
	 */
	
	//@Id
	private String gameId;
	private Player playerA;
	private Player playerB;
	
	//@JsonIgnore
	private int currentPitIndex;

	public MancalaGame() {
		this (MancalaConstants.DEFAULT_PIT_STONES);
		
		//Setting up players and their pits initial setup
		this.playerA = new Player("PlayerA");
		this.playerB = new Player("PlayerB");
	}
	
	public MancalaGame(int stones) {
		
		//Setting up players and their pits initial setup
		
	}
	
	public MancalaGame(String playerA, String playerB) {
		
	}

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public Player getPlayerA() {
		return playerA;
	}

	public void setPlayerA(Player player) {
		this.playerA = player;
	}
	
	public Player getPlayerB() {
		return playerB;
	}

	public void setPlayerB(Player player) {
		this.playerB = player;
	}

	public int getCurrentPitIndex() {
		return currentPitIndex;
	}

	public void setCurrentPitIndex(int currentPitIndex) {
		this.currentPitIndex = currentPitIndex;
	}
	
	

}
