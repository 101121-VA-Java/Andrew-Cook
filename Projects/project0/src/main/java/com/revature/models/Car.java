package com.revature.models;

import java.util.ArrayList;
import java.util.Objects;

public class Car {
	
	String carType;
	String model;
	String carCondition;
	int numMiles;
	int year;
	double price;
	boolean ownedState;
	String color;
	private String carexceptions;
	Object id;
	
	public Car(String carType, String model, String carCondition, int numMiles, String color, double price,
			boolean ownedState, int year, String carexceptions) {
		
		super();
		this.carType = carType;
		this.model = model;
		this.carCondition = carCondition;
		this.numMiles = numMiles;
		this.year = year;
		this.color = color;
		this.price = price;
		this.ownedState = ownedState;
		this.carexceptions = carexceptions;
	}
	public String getcarType() {
		return carType;
	}

	public void setcarType(String carType) {
		this.carType = carType;
	}

	public String getmodel() {
		return model;
	}

	public void setmodel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getcolor() {
		return getcolor();
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isOwned() {
		return ownedState;
	}

	public void setOwned(boolean owned) {
		this.ownedState = owned;
	}

	@Override
	public int hashCode() {
		Object id;
		Object color;
		return Objects.hash(color, id, ownedState, price, size, carCondition);
	}

	public boolean equals(Object obj, Object color) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(color, other.color) && id == other.id && ownedState == other.owned && price == other.price
				&& Objects.equals(size, other.size) && Objects.equals(carCondition, other.carCondition);
	}

	@Override
	public String toString() {
		return "Car [type=" + carCondition + ", price=" + price + ", color=" + color +  + " owned=" + ownedState + "]";
	}
	public static void acceptRejectOffer(int offerId, boolean b, int offerId2) {
		// TODO Auto-generated method stub
		
	}
	public static void viewCarPayments() {
		// TODO Auto-generated method stub
		
	}
	public static ArrayList<Car> getAllCar() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
	
}
