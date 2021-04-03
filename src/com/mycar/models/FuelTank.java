package com.mycar.models;

public class FuelTank extends CarPart{
	
	private double fuelLevel;
	private double tankSize;

	FuelTank(double tankSize) {
		this.tankSize = tankSize;
		this.fuelLevel = tankSize;
	}
	
	@Override
	public void function() {
		System.out.println("Fuel level: " + fuelLevel + "/" + tankSize);
		
	}

}
