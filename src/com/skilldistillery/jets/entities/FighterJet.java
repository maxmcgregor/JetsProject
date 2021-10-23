package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements ChasesTarget {

	public FighterJet() {
		super();
	}

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public String toString() {
		System.out.println("\tType: Fighter Jet");	
		return super.toString();
	}

	public void zoomAtTarget() {
		System.out.println("Fighter jet turbines engaged, " + this.getModel() + " zoom at target!");	
	}	
}
