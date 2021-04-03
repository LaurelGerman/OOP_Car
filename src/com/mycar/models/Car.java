package com.mycar.models;

import java.util.*;

public class Car {
	
	private Engine engine;
	private FuelTank fuelTank;
	private Transmission transmission;
	private Wheels wheels;
	private ArrayList<CarPart> parts;
	
	public Car(int cylindars, double tankSize, Transmission.Type transType, int wheelCount) {
		this.engine = new Engine(cylindars);
		this.fuelTank = new FuelTank(tankSize);
		this.transmission = new Transmission(transType);
		this.wheels = new Wheels(wheelCount);
		 
		this.parts = new ArrayList<>();
		
		this.parts.add(engine);
		this.parts.add(fuelTank);
		this.parts.add(transmission);
		this.parts.add(wheels);
	}
	
	public Car(int cylindars, double tankSize, int wheelCount) {
		this.engine = new Engine(cylindars);
		this.fuelTank = new FuelTank(tankSize);
		this.wheels = new Wheels(wheelCount);
		 
		this.parts = new ArrayList<>();
		
		this.parts.add(engine);
		this.parts.add(fuelTank);
		this.parts.add(wheels);
	}
	
	
	public void run(){
		for(CarPart part: parts) {
			part.function();
		}
		System.out.println();
	}

}
