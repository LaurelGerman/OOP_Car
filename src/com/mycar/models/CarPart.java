package com.mycar.models;

public abstract class CarPart implements Functional{
	
	protected int condition;
	
	void status() {
		System.out.println("Condition is: " + condition);
	}

}
