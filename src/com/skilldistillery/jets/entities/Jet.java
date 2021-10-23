package com.skilldistillery.jets.entities;

public abstract class Jet {
	
	protected String model;
	protected double speed;
	protected int range;
	protected long price;
	
	public Jet() {
		
	}

	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		double mach = this.speed * 0.001303;
		
		System.out.println("\tModel: " + this.model);
		System.out.println("\tSpeed: " + this.speed + " MPH");
		System.out.printf("\tSpeed in Mach: %.2f%n", mach);
		System.out.println("\tRange: " + this.range + " miles");
		System.out.println("\tPrice: $" + this.price + "\n");
		return "";
	}
	
	public void fly() {
		double flyingTime = (double) (this.range / this.speed);
		
		int flyTimeInHours = (int) flyingTime;
		int flyTimeInMinutes = (int)((flyingTime - flyTimeInHours) * 60);
		double mach = this.speed * 0.001303;
		
		System.out.println("Aircraft Details: ");
		System.out.println("\tModel: " + this.model);
		System.out.println("\tSpeed in MPH: " + this.speed);
		System.out.printf("\tSpeed in Mach: %.2f%n", mach);
		System.out.println("\tRange: " + this.range + " miles");
		System.out.println("\tPrice: $" + this.price);
		System.out.println("\tFlying Time: " + flyTimeInHours + " hours " + flyTimeInMinutes + " minutes.\n");
	}
	
	
	
}
