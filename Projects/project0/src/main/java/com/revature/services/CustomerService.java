package com.revature.services;


import java.util.List;

import javax.security.auth.login.LoginException;
import com.revature.controllers.FrontController;
import com.revature.models.Customer;
import com.revature.models.CustomerList;
import com.revature.repositories.CustomerDao;
import com.revature.repositories.CustomerPostgres;

public class CustomerService {
	private CustomerDao ud;
	private CustomerPostgres up;

	public UserServices() {
		up = new UserPostgres();
	}

	public String newUser(User u) {
		String userAdded = "Sorry, we were unable to create an account for you.";
		try {
			up.addUser(u);
			return "true";
		}

		// return null;
		catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return userAdded;
	}

	public String loginSystem(String username, String pword, String uname) throws SQLException, IOException {

		User loggedIn = null;

	//	try {
			loggedIn = up.getUsername(username);
	private static CustomerDao cd = new CustomerPostgres();
	private Customer c;
	
	public Customer addCustomer(Customer c);
		Customer newCustomer = this.getCustomerByEmail(c.getEmail());
	
		public Customer getCustomerByEmail(String email) {
			List<Customer> customers = cd.getAll();
			for(Customer c : customers) {
				if(c.getEmail().equals(email)) {
					return c;
				}
			}
			return null;
		}
			
		private Customer getCustomerByEmail(Object email) {
			// TODO Auto-generated method stub
			return null;
		}

		public Customer login(String email, String password) throws LoginException{
			Customer cust = this.getCustomerByEmail(email);
			if(cust == null || !cust.getPassword().equals(password)) {
				throw new LoginException();
			}
			cust.setLoggedIn(true);
			cd.update(cust);
			return cust;
		}
		
		public void logout() {
			List<Customer> customers = cd.getAll();
			for (Customer cust : customers) {
				if(cust.isLoggedIn() == true) {
					cust.setLoggedIn(false);
				}
			}
		}

	
	
	
}



