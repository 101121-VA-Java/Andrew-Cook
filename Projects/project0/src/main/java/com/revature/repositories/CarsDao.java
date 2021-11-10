package com.revature.repositories;
import com.revature.models.Car;
import com.revature.models.CarCondition;

import java.util.ArrayList;
import java.util.List;
public interface CarsDao extends GenericDao<Car> {

	Car[] getInventory();      // Car Inventory data access object.
		Car getCarByModel(String Model);
		Car getCarByYear(int year);
		Car getCarByColor(String color);
		long addCar(Car b);
		CarCondition getCarByCondition();
		String findCar(String title);
		List<Car> getAllCarsByModel();
		List<Car> getAllCarsByYear();
}

public ArrayList<Car> getAllCar() {
	// TODO Auto-generated method stub
	return null;
}