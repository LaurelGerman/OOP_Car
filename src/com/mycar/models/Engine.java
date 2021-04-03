package com.mycar.models;

public class Engine extends CarPart{
	
	private boolean isOn;
	private int cylindars;
	
	Engine(int cylindars){
		this.cylindars = cylindars;
		this.isOn = false;
	}
	
	@Override
	public void function() {
		
		if(this.isOn) {
			System.out.println(cylindars + "-cylindar engine is on");
		}
		else {
			System.out.println(cylindars + "-cylindar engine is off");
		}
	}
}
