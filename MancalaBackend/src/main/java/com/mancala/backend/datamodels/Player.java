package com.mancala.backend.datamodels;

import java.util.Arrays;
import java.util.List;

public class Player {
	
	private String playerName;
	private int totalScore; 
	private List<MancalaPit> smallPits; 
	private int bigPitId;
	private char active;
	
	public Player(String playerName) {
		super();
		this.totalScore = 0;
		this.playerName = playerName;
		this.active = 'N';
		
		if(playerName.equals("PlayerA")) {
			this.bigPitId = MancalaConstants.PLAYER_A_BIG_PIT_ID;
			this.smallPits = Arrays.asList(
					new MancalaPit(MancalaConstants.PLAYER_A_FIRST_PIT_ID), 
					new MancalaPit(MancalaConstants.PLAYER_A_SECOND_PIT_ID), 
					new MancalaPit(MancalaConstants.PLAYER_A_THIRD_PIT_ID), 
					new MancalaPit(MancalaConstants.PLAYER_A_FOURTH_PIT_ID), 
					new MancalaPit(MancalaConstants.PLAYER_A_FIFTH_PIT_ID), 
					new MancalaPit(MancalaConstants.PLAYER_A_SIXTH_PIT_ID),
					new MancalaPit(MancalaConstants.PLAYER_A_BIG_PIT_ID, MancalaConstants.EMPTY_PIT_STONES)
					);			
		}
		else if(playerName.equals("PlayerB")) {
			this.bigPitId = MancalaConstants.PLAYER_B_BIG_PIT_ID;
			this.smallPits = Arrays.asList(
					new MancalaPit(MancalaConstants.PLAYER_B_FIRST_PIT_ID), 
					new MancalaPit(MancalaConstants.PLAYER_B_SECOND_PIT_ID), 
					new MancalaPit(MancalaConstants.PLAYER_B_THIRD_PIT_ID), 
					new MancalaPit(MancalaConstants.PLAYER_B_FOURTH_PIT_ID), 
					new MancalaPit(MancalaConstants.PLAYER_B_FIFTH_PIT_ID), 
					new MancalaPit(MancalaConstants.PLAYER_B_SIXTH_PIT_ID),
					new MancalaPit(MancalaConstants.PLAYER_B_BIG_PIT_ID, MancalaConstants.EMPTY_PIT_STONES)
					);			
		}
		else {
			System.out.println("Something went wrong while creating player!");
		}
	}
	

	public String getPlayerName() {
		return playerName;
	}



	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}



	public int getTotalScore() {
		return totalScore;
	}



	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}



	public List<MancalaPit> getSmallPits() {
		return smallPits;
	}



	public void setSmallPits(List<MancalaPit> smallPits) {
		this.smallPits = smallPits;
	}



	public int getBigPitId() {
		return bigPitId;
	}



	public void setBigPitId(int bigPitId) {
		this.bigPitId = bigPitId;
	}



	public char getActive() {
		return active;
	}



	public void setActive(char active) {
		this.active = active;
	}



	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", totalScore=" + totalScore + "]";
	}

}
