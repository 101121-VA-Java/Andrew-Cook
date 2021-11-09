package com.revature.controllers;
import com.revature.services.CarServices;
import com.revature.services.EmployeeService;
import java.util.Scanner;

public class EmployeeController {

	private static Scanner sc = new Scanner(System.in);
	boolean flag = true;
		
		public static void employeeDashboard() {
		while(flag) {
			System.out.println("+--------------------------------------------+");
			System.out.println("  Welcome Employee! Please select an option.");
			System.out.println("\n 1: Remove an item.");
			System.out.println("\n 2: Add an item.");
			System.out.println("\n 3: View all offers.");
			System.out.println("\n 4: View payments.");
			System.out.println("\n 5: Log out.");
			System.out.println("\n+-------------------------------------------+");
	
		}
		String input = sc.nextLine();
		switch(input) {
		case "1" :
			private static void removeCar = new 
			
		case "2" :
			// Remove an item from the shop
			System.out.println();
			flag = false;
			break;
			
		case "3" :
			System.out.println();
			flag = false;
			break;
			
		case "4" :
			System.out.println();
			flag = false;
			break;
			
		case "5" :
			System.out.println();
			flag = false;
			break;
			
		default:
			System.out.println("Please input a selection of 1 - 5.");
	
	
		}
		}
		private static void carOffers(Scanner sc) {
			CarServices mems = new CarServices();
			ArrayList<CarOffers> displayListMemberOffers = mems.carOffers();
			System.out.println("Please choose the ID number for the offer you would like to update");
			int offerId = sc.nextInt();
			System.out.println("Would you like to accept or reject this offer?");
			boolean decision = sc.nextBoolean();
			if(decision) {
				for (MemberOffers mo : displayListMemberOffers) {
					if(mo.getOfferId() == offerId) {
						mems.acceptRejectOffer(offerId, true, mo.getOfferId());
					}
				}
			}
		}
		private static void viewAllPayments(Scanner sc) {
			CarServices mems = new CarServices();
			car.viewCarPayments();
		
		
		
		
		
		

		public void RegisterUser(Scanner sc2) {
			// TODO Auto-generated method stub
			
		}

		public void login(Scanner sc2) {
			// TODO Auto-generated method stub
			
			
		}
	
	
	
}
