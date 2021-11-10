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
		}
		public static void removeCar(Scanner sc) {
			CarServices car = new CarServices();
				ArrayList<Car> displayListCars = Car.getAllCar();
				if (displayListCars != null) {
					Car[] displayListCars;
					for(Car car : displayListCars) {
						System.out.println(car);
					}
				System.out.println("Which ID to remove");
				int memId = sc.nextInt();
				CarServices carbs = new CarServices();
				carbs.removeCar(carId);
				}
				else{
					
					System.out.println("Invalid");
				}
				
			}
		public void displayListCars(ArrayList<Car> list) {
			for (Car car : list) {
				System.out.println(car);
		}
		
		public static void addCar(Scanner sc2) {
			System.out.println("Car ID number");
			double carid = sc.nextInt();
			System.out.println("Car year");
			int caryear = sc.nextInt();
			System.out.println("Car make");
			int carmake = sc.nextInt();
			System.out.println("Car model");
			String carmodel = sc.nextLine();
			System.out.println("Car price");
			String carprice = sc.nextLine();
			
			Car newcar = new Car(carid, caryear, carmake, carmodel, carprice);
			CarServices carser = new CarServices();
			
			if(carser.addCar(newcar) == false) {
				System.out.println("Invalid");
			}else {
				System.out.println("Car added");
				
		Car newCar = new Car(carId, carYear, carMake, carModel, carPrice);
		CarServices carser = new CarServices();
		if(carser.addCar(newcar) == false) {
			System.out.println("Add unsuccessful");
		}else {
			System.out.println("The car has been added to the list.");
			
				}
		public static void carOffers(Scanner sc) {
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
		public static void viewAllPayments(Scanner sc) {
			CarServices car = new CarServices();
			Car.viewCarPayments();
		}
		
		public void RegisterUser(Scanner sc2) {
			// TODO Auto-generated method stub
			
		}

		public void login(Scanner sc2) {
			// TODO Auto-generated method stub
			
			
		}
	


}
