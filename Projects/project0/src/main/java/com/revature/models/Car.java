package com.revature.models;

import java.util.ArrayList;
import java.util.Objects;

public class Car {


	int carId;
	int carYear;
	String carMake;
	String carModel;
	double carPrice;
	boolean ownedState;
	String color;
	private String carexceptions;
	Object id;
	
	public Car(int carYear, String carMake, String carModel, double carPrice) {
		super();
		this.carYear = carYear;
		this.carMake = carMake;
		this.carModel = carModel;
		this.carPrice = carPrice;
	}

	public Car(int carId, int carYear, String carMake, String carModel, double carPrice, boolean ownedState,
			String carexceptions) {
		super();
		this.carId = carId;
		this.carYear = carYear;
		this.carMake = carMake;
		this.carModel = carModel;
		this.carPrice = carPrice;
		this.ownedState = ownedState;
		this.carexceptions = carexceptions;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public int getCarYear() {
		return carYear;
	}

	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}

	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public double getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}

	public boolean isOwnedState() {
		return ownedState;
	}

	public void setOwnedState(boolean ownedState) {
		this.ownedState = ownedState;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCarexceptions() {
		return carexceptions;
	}

	public void setCarexceptions(String carexceptions) {
		this.carexceptions = carexceptions;
	}

	public Object getId() {
		return id;
	}

	public void setId(Object id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(carId, carMake, carModel, carPrice, carYear, carexceptions, color, id, ownedState);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return carId == other.carId && Objects.equals(carMake, other.carMake)
				&& Objects.equals(carModel, other.carModel)
				&& Double.doubleToLongBits(carPrice) == Double.doubleToLongBits(other.carPrice)
				&& carYear == other.carYear && Objects.equals(carexceptions, other.carexceptions)
				&& Objects.equals(color, other.color) && Objects.equals(id, other.id) && ownedState == other.ownedState;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carYear=" + carYear + ", carMake=" + carMake + ", carModel=" + carModel
				+ ", carPrice=" + carPrice + ", ownedState=" + ownedState + ", color=" + color + ", carexceptions="
				+ carexceptions + ", id=" + id + "]";
	}
	
}
