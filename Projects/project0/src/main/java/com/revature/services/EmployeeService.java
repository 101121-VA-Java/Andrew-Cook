package com.revature.services;

import com.revature.models.Employee;
import com.revature.models.User;
import com.revature.repositories.EmployeeDao;
import com.revature.repositories.EmployeePostgres;

import java.io.IOException;
import java.sql.SQLException;

import com.revature.Role;

public class EmployeeService {

	
private static EmployeeDao ed = new EmployeePostgres();

	public static Employee addEmployee(Employee newEmp) {
		
		return ed.add(newEmp);
	}
	

	public UserServices() {
		up = new UserPostgres();
	}

	public String newUser(User u) {
		String userAdded = "Sorry, we were unable to create an account for you.";
		try {
			up.addUser(u);
			return "true";
		}

		catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return userAdded;
	}

	public String loginSystem(String username, String pword, String uname) throws SQLException, IOException {

		User loggedIn = null;

			loggedIn = up.getUsername(username);
			
	
			if (loggedIn != null) {
				if (loggedIn.getPassword().equals(pword)) {
					User.u = loggedIn;
					return "loginsuccess";

				} else {
					return "Invalid login credentials";
				}

			} else {
				return "Cannot locate username";
			}

}
}