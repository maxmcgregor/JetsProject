package com.skilldistillery.jets.entities;

public class Broom extends Jet implements ChasesTarget {

	public Broom() {
		super();
	}

	public Broom(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public String toString() {
		System.out.println("\tType: Broom");
		return super.toString();
	}

	public void zoomAtTarget() {
		System.out.println("Golden snitch spotted, " + this.getModel() + " zoom at target!");
	}

}
