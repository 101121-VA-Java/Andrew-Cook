package com.revature.driver;


import java.util.Scanner;


public class Driver {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
   
        System.out.println("What food do you like ?");
        String mySc = sc.nextLine(); 
        
        
        System.out.println("The ingredients for your food are "+ s.Ingredients(mySc));
        mySeasonTemperature(s.averageTemperature(mySc));
        sc.close();
        
        
    }
    
    public static void mySeasonTemperature(int temperature) {
    	System.out.println("Temperature average for your season is " + temperature);
    	
    }
    
    
    
}