package com.revature.repositories;
import com.revature.models.Car;
public interface CarsDao {

	Car[] getAllCars();
		Car getCarByModel(String Model);
		Car getCarByYear(int year);
		
}
