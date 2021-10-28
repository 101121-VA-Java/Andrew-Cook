package com.revature.models;

public class Car {
	
	String carType;
	String model;
	String carCondition;
	int numMiles;
	String numColor;
	double price;
	boolean ownedState;
	
	public Car(String carType, String model, String carCondition, int numMiles, String numColor, double price,
			boolean ownedState) {
		
		super();
		this.carType = carType;
		this.model = model;
		this.carCondition = carCondition;
		this.numMiles = numMiles;
		this.numColor = numColor;
		this.price = price;
		this.ownedState = ownedState;
	}

	
}
