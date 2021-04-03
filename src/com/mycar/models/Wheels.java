package com.mycar.models;

public class Wheels extends CarPart{
	
	private int wheelCount;
	
	Wheels(int wheelCount){
		this.wheelCount = wheelCount;
	}
	
	public void function() {
		System.out.println("I have " + wheelCount + " wheels");
	}

}
