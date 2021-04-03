package com.mycar.models;

import java.util.*;

import com.mycar.models.Transmission.Gear;

public class Manual extends Transmission{

	protected void setGears(){
		
		this.gearSet = new ArrayList<Gear>() {{
			add(Gear.REVERSE);
			add(Gear.NEUTRAL);
			add(Gear.FIRST);
			add(Gear.SECOND);
			add(Gear.THIRD);
			add(Gear.FOURTH);
			add(Gear.FIFTH);
		}};
				
		this.currentGear= Gear.NEUTRAL;
		
	}

}
