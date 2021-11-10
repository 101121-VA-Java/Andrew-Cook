package com.revature.services;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.security.auth.login.LoginException;
import com.revature.controllers.FrontController;
import com.revature.models.Customer;
import com.revature.models.CustomerList;
import com.revature.models.User;
import com.revature.repositories.CustomerDao;
import com.revature.repositories.CustomerPostgres;

public class CustomerService {
	private CustomerDao ud;
	private CustomerPostgres up;

	public CustomerService(Scanner sc) {
		
		boolean run = true;
		while(run) {
			System.out.println("+-----------------------------------------------------------------+");
			System.out.println("|                 Welcome Customer!                               |");
			System.out.println("|          Take a look at the pre-owned cars!                     |");
			System.out.println("|  1:     View inventory                                          |");
			System.out.println("|  2:     View owned cars                                         |");
			System.out.println("|  3:     View remaining payments                                 |");
			System.out.println("|  4:     Exit                                                    |");
			System.out.println("+-----------------------------------------------------------------+");
		}
		String input = sc.nextLine();
		
		switch(input) {
		case "1":
			carMenu(sc);
			break;
		case "2":
			viewOwnedItems(sc);
			break;
		case "3":
			viewRemainingPayment(sc);
			break;
		case "4":				
			run = false;
			break;
		default:
			System.out.println("Invalid input.");
		}
	}
		
private void carMenu(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

private void itemsMenu(Scanner sc) {
		
		Items li = new Items();
		ArrayList<Item> listitems = li.getItems();
		if (listitems.size() != 0) {
			for (Item i : listitems) {
				System.out.println(i);
			}
			
			System.out.println("Interested in seing a car? ");
			boolean continueOffer = iv.validateBoolean(sc);
			if (continueOffer) {
			System.out.println("Car ID? ");
			int itemNum = iv.validateInt(sc);
			//sc.nextLine();
			System.out.println("Offer amount? ");
			double itemPrice = iv.validateDouble(sc);
			sc.nextLine();
			
			Items i = new Items();
			i.makeOffer(User.currentUser, carId, carPrice);
			
		}
		else {
			System.out.println("Nothing here, empty lot.");
		}
		}
	
}
	private void viewOwnedItems(Scanner sc) {
		Items item = new Items();
		item.viewOwnedItems(User.currentUser.getId());
	}
	private void viewRemainingPayment(Scanner sc) {
		Items item = new Items();
		item.viewOwnedPayments(User.currentUser.getId());
		
		
	}
	
	
}
	
	



