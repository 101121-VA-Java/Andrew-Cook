package com.revature.repositories;

import java.util.List;
import java.sql.SQLException;
import com.revature.models.Customer;
import com.revature.models.User;

import java.io.IOException;

public class CustomerDao {
	void addCustomer(Customer u) throws SQLException, IOException;
	
	User getUsername(String username) throws SQLException, IOException;
	
	public void update(Customer cust) {
		// TODO Auto-generated method stub
		
	}

	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}




