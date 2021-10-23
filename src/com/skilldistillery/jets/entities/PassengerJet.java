package com.skilldistillery.jets.entities;

public class PassengerJet extends Jet implements HighlyRegulated {
	private int numPassengers;

	public PassengerJet(int numPassengers) {
		super();
		this.numPassengers = numPassengers;
	}

	public int getNumPassengers() {
		return numPassengers;
	}

	public void setNumPassengers(int numPassengers) {
		this.numPassengers = numPassengers;
	}

	
	@Override
	public String toString() {
		return "PassengerJet [numPassengers=" + numPassengers + ", toString()=" + super.toString() + "]";
	}

	public void getInspected() {
		// TODO Auto-generated method stub

	}

}
