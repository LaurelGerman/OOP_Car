package com.mycar.models;

import java.util.List;

public class Transmission extends CarPart{
	
	public enum Type {MANUAL, AUTOMATIC};	
	protected enum Gear {PARK, DRIVE, REVERSE, NEUTRAL, FIRST, SECOND, THIRD, FOURTH, FIFTH};
	
	private Type type;
	protected Gear currentGear;
	
	protected List<Gear> gearSet;
		
	protected Transmission(){
		
	}
	
	
	Transmission(Type type){
		this.type = type;
		
		Transmission trans = new Transmission();
		
		if(type.equals(Type.MANUAL)) {
			trans = new Manual();
			((Manual) trans).setGears();
			this.currentGear = trans.currentGear;
			this.gearSet = trans.gearSet;
		}
		else {
			trans = new Automatic();
			((Automatic) trans).setGears();
			this.currentGear = trans.currentGear;
			this.gearSet = trans.gearSet;
		}
		
	}
	
	
	public void setCurrentGear(Gear gear) {
		this.currentGear = gear;
	}
	
	
	public void function() {
		
		System.out.println("Current gear: " + this.currentGear);
		
	}

}
