package com.revature.repositories;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class EmployeeList {

        Connection con;

    public static Connection getConnectionFromFile() throws IOException, SQLException {
    	
        Properties prop = new Properties();
        
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        
        prop.load(loader.getResourceAsStream("prop.properties"));

        String url = prop.getProperty("url");
        
        String username = prop.getProperty("username");
        
        String password = prop.getProperty("password");
        
        try {
        	
            if (con == null || con.isClosed()) {
            	
                con = DriverManager.getConnection(url, username, password);
                
            }
            
        } catch (Exception e) {
        	
            System.out.println("Error: " + e.toString());
        }
        return con;

    }
}
