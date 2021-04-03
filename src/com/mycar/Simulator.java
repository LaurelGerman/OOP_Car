package com.mycar;

import com.mycar.models.Car;
import com.mycar.models.Transmission.Type;

public class Simulator {
	
	public static void main(String[] args) {
		
		Car myCar = new Car(6,12,Type.MANUAL,4); //cylinders, tank size, transmission type, wheels
		myCar.run();
		
		Car myCar2 = new Car(8,14,Type.AUTOMATIC,6);
		myCar2.run();
		
		
	}

}
