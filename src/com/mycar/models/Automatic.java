package com.mycar.models;

import java.util.*;

public class Automatic extends Transmission{
	
	protected void setGears(){		
	
		this.gearSet = new ArrayList<Gear>() {{
			add(Gear.REVERSE);
			add(Gear.NEUTRAL);
			add(Gear.PARK);
			add(Gear.DRIVE);
		}};
				
		this.currentGear= Gear.PARK;
		
	}
	

}
