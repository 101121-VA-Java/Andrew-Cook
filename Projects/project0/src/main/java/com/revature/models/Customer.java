package com.revature.models;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.services.ConnectionUtility;

public class Customer {

		private String name;
		private int customerID;
		private String username;
		private String password;
		
		public Customer() {
			super();
			this.name = name;
			this.password = password;
			this.username = username;
			
		}
		public void setUsername() {
			this.username = username;
		}
		public int getCustomerID() {
			return customerID;
		}
		public String setPassword() {
			return password;
		}
		public String getPassword() {
			return password;
		}
		public Object getEmail() {
			// TODO Auto-generated method stub
			return null;
		}
		public void setLoggedIn(boolean b) {
			// TODO Auto-generated method stub
			
		}
		public boolean isLoggedIn() {
			// TODO Auto-generated method stub
			return false;
		}
		
		
		Connection con = null;
		public User getUsername(String username) throws SQLException, IOException{
			User u = null;
					con = ConnectionUtility.getConnectionFromEnv();
					String sql = "select * from users where username = '" + username + "';";
					java.sql.Statement state = con.createStatement();
					ResultSet rs = state.executeQuery(sql);
					
		while (rs.next()) {
			Role role = null;
			if(rs.getString("userrole").equals("CUSTOMER")) {
				role = Role.CUSTOMER;
			} else if(rs.getString("userrole").equals("EMPLOYEE")) {
				role = Role.EMPLOYEE;
		}else if (rs.getString("urole").equals("OWNER")) {
			role = Role.OWNER;
		}
			u = new User(rs.getString("username"), rs.getString("password"), rs.getString("uname"), role);
			u.setId(rs.getInt("id"));
			return u;		
			
			}
		
		return null;
		
		}
		
		public void addUser(User u) throws SQLException, IOException{
	
				con = ConnectionUtility.getConnectionFromEnv();
				String sql = "insert into users (username, password, username, urole) values (?, ?, ?, ?)";
				PreparedStatement  ps = con.prepareStatement(sql);
				String Role = u.getUsername();
				ps.setString(1, u.getUsername());
				ps.setString(2, u.getPassword());
				ps.setString(3,u.getUsername());
				ps.setString(4, Role);			
				
				ps.executeUpdate();
			
		
		}

}
