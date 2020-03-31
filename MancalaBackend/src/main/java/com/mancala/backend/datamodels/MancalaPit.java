package com.mancala.backend.datamodels;

public class MancalaPit {
	/*
	 * 
	 */

	private int pitId;	
	private int stonesInPit;

	public MancalaPit(int pitId) {
		this.pitId = pitId;
		this.stonesInPit = MancalaConstants.DEFAULT_PIT_STONES;
	}
	
	//For initializing big pits
	public MancalaPit(int pitId, int stones) {
		this.pitId = pitId;
		this.stonesInPit = stones;
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
