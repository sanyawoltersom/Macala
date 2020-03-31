package com.mancala.backend.datamodels;

public class MancalaPit {
	/*
	 * 
	 */

	private int pitId;
	
	private int stonesInPit;


	public MancalaPit() {

	}

	public MancalaPit(int pitId) {
		this.pitId = pitId;
		this.stonesInPit = MancalaConstants.DEFAULT_PIT_STONES;
	}

	public int getPitId() {
		return pitId;
	}

	public void setPitId(int pitId) {
		this.pitId = pitId;
	}

	public int getStonesInPit() {
		return stonesInPit;
	}

	public void setStonesInPit(int stonesInPit) {
		this.stonesInPit = stonesInPit;
	}

}
