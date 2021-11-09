package com.revature.controllers;
import com.revature.models.Car;
import com.revature.models.CarOffers;
import com.revature.services.CarServices;
import com.revature.services.EmployeeService;

import java.util.ArrayList;
import java.util.Scanner;
import com.revature.models.*;
public class EmployeeController {

	private static Scanner sc = new Scanner(System.in);
	boolean flag = true;
		
		public static void employeeDashboard() {
			while(flag) {
			System.out.println("+--------------------------------------------+");
			System.out.println("| Welcome Employee! Please select an option. |");
			System.out.println("| 1: Remove a car.                           |");
			System.out.println("| 2: Add a Car.                              |");
			System.out.println("| 3: View all offers.                        |");
			System.out.println("| 4: View payments.                          |");
			System.out.println("| 5: Log out.                                |");
			System.out.println("+--------------------------------------------+");
	
		}
			String choice = sc.nextLine();
				switch(choice) {
				case "1":
					removeCar(sc);
					break;
				case "2":
					addCar(sc);
				break;
				case "3":
					carOffers(sc);
					break;
				case "4":
					viewAllPayments(sc);
					break;
				case "5":
					flag = false;
					break;
				default:
				System.out.println("Invalid, please select 1 - 5.");
		}
		
	/*
	 * 	String carType;
	String model;
	String carCondition;
	int numMiles;
	int year;
	double price;
	boolean ownedState;
	private String color;
	private String carexceptions;
	private Object id;
	 */
	
		}
		private static void removeCar(Scanner sc) {
			CarServices mems = new CarServices();
				ArrayList<Car> displayListCars = Car.getAllCar();
				if (displayListCars != null) {
					Car[] displayListCars;
					for(Car mem : displayListCars) {
						System.out.println(car);
					}
				System.out.println("Which ID to remove");
				int memId = sc.nextInt();
				CarServices membs = new CarServices();
				membs.removeCar(carId);
				}
				else{
					
					System.out.println("Invalid");
				}
				
			}
			
		}
		private static void addCar(Scanner sc2) {
			System.out.println("Price");
			double carprice = sc.nextInt();
			System.out.println("Year");
			int caryear = sc.nextInt();
			System.out.println("Mileage");
			int carmiles = sc.nextInt();
			System.out.println("Model");
			String carmodel = sc.nextLine();
			System.out.println("Color");
			String carcolor = sc.nextLine();
			
			Car newcar = new Car(carprice, caryear, carmiles, carmodel, carcolor);
			CarServices carser = new CarServices();
			
			if(carser.addCar(newcar) == false) {
				System.out.println("Invalid");
			}else {
				System.out.println("Car added");
			
		}
		}
		private static void carOffers(Scanner sc) {
			CarServices car = new CarServices();
			ArrayList<CarOffers> displayListCarOffers = car.carOffers();
			System.out.println("Input offer to update");
			int offerId = sc.nextInt();
			System.out.println("accept/reject?");
			boolean decision = sc.nextBoolean();
			if(decision) {
				for (CarOffers mo : displayListCarOffers) {
					if(mo.getOfferId() == offerId) {
						Car.acceptRejectOffer(offerId, true, mo.getOfferId());
					}
				}
			}
		}
		private static void viewAllPayments(Scanner sc) {
			CarServices car = new CarServices();
			Car.viewCarPayments();
		}
		
		
		
		
		

		public void RegisterUser(Scanner sc2) {
			// TODO Auto-generated method stub
			
		}

		public void login(Scanner sc2) {
			// TODO Auto-generated method stub
			
			
		}
	
		public void displayListMemberships(ArrayList<Car> list) {
			for (Car car : list) {
				System.out.println(car);
		}
		Car newcar = new Car(carprice, caryear, carmiles, carmodel, carcolor);
		CarServices memser = new CarServices();
		if(carser.addCar(newcar) == false) {
			System.out.println("Add unsuccessful");
		}else {
			System.out.println("Membership added successfully!");
}
