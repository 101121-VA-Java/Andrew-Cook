package com.revature.models;


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
		
}
