package com.skilldistillery.jets.entities;

public class Broom extends Jet implements ChasesTarget {
	private String designer;

	
	
	public Broom(String designer) {
		super();
		this.designer = designer;
	}

	public String getDesigner() {
		return designer;
	}

	public void setDesigner(String designer) {
		this.designer = designer;
	}

	@Override
	public String toString() {
		return "Broom [designer=" + designer + ", toString()=" + super.toString() + "]";
	}

	public void zoomAtTarget() {
		System.out.println("Golden snitch spotted, capture mode engaged!");

	}

}
