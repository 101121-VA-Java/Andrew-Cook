package com.revature.services;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.revature.models.Car;
import com.revature.models.CarOffers;
import com.revature.repositories.CarPostgres;

public class CarServices {

		private CarPostgres cp;
		public CarServices() {
		cp = new CarPostgres();
		}
		public boolean addCar(Car Cars) {
			try {
				cp.addCars(Cars);
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}return true;
		}
		public void removeCar(int carId) {
			try {
				cp.removeCar(carId);
			}catch(SQLException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
			}
		public ArrayList<Car> getAllCar(){
			try {
				return cp.viewAllCars();
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
			return null;
			
		public ArrayList<Car> viewMyCars(int userId){
			try {
					displayListCars(cp.viewMyCars(userId));
			}catch (SQLException e) {
					e.printStackTrace();
			}catch (IOException e) {
					e.printStackTrace();
			}
			return null;
			
		public ArrayList<CarOffers> customerOffers(){
			try {
					displayListCarOffers(cp.carOffers());
				return cp.carOffers();
			}catch(SQLException e) {
					e.printStackTrace();
			}catch (IOException e) {
					e.printStackTrace();
			}
			
			return null;
			}
			
		private void displayListCarOffers(Object carOffers) {
			// TODO Auto-generated method stub
			
		}

}
		private void displayListCars(Object viewMyCars) {
			// TODO Auto-generated method stub
			
		}
		public ArrayList<CarOffers> carOffers() {
			// TODO Auto-generated method stub
			return null;
		}
}
