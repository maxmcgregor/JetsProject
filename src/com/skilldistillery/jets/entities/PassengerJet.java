package com.skilldistillery.jets.entities;

public class PassengerJet extends Jet implements HighlyRegulated {

	public PassengerJet() {
		super();
	}

	public PassengerJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public String toString() {
		System.out.println("\tType: Passenger Jet");
		return super.toString();
	}

	public void getInspected() {
		System.out.println("FAA here to inspect passenger jet " + this.model + ".");
	}

}
