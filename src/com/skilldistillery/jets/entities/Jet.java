package com.skilldistillery.jets.entities;

public abstract class Jet {
	
	private String model;
	private double speed;
	private int range;
	private long price;
	
	
	
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
		return "Jet [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
	}
	
	public double getSpeedInMach(double speedInMPH) {
		double speedInMach = speedInMPH / 767;
		return speedInMach;
	}
	
	public void fly() {
		int flyingTime = (int) (this.range / this.speed);
				
		System.out.println("Aircraft Details: ");
		System.out.println("\tModel: " + this.model);
		System.out.println("\tSpeed: " + this.speed + "MPH");
		System.out.println("\tRange: " + this.range + "miles");
		System.out.println("\tPrice: $" + this.price);
		System.out.println("\tFlying Time: " + flyingTime + " hours");
	}
	
	
	
}
