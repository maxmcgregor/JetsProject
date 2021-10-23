package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements ChasesTarget {
	private String mainWeapon;
	
	
	
	
	public FighterJet(String mainWeapon) {
		super();
		this.mainWeapon = mainWeapon;
	}

	

	public String getMainWeapon() {
		return mainWeapon;
	}



	public void setMainWeapon(String mainWeapon) {
		this.mainWeapon = mainWeapon;
	}



	@Override
	public String toString() {
		return "FighterJet [mainWeapon=" + mainWeapon + ", toString()=" + super.toString() + "]";
	}



	public void zoomAtTarget() {
		System.out.println("Fighter jet turbines engaged, zooming towards target!");
		
	}
	
}
