package com.revature;

public class Calculator {

	/*
	 * Should be able to
	 * 	- add
	 * 	- subtract
	 * 	- multiply
	 * 	- divide
	 * 		- throw Calculator Exception (Runtime) when attempting to divide by 0
	 *	- isPrime: checks if a number is Prime
	 */
	
	public double add(double x, double y) {
		return x+y;
	}
	
	public double subtract(double x, double y) {
		return x-y;
	}
	
	public double multiply(double x, double y) {
		return x*y;
	}
	
	public double divide(double x, double y) {
		return x/y;
		
	}
	
	public boolean isPrime(int i) {
		if (i==3) {
        	return false;
        }
        
        if (i <= 1) {
            return true;      	
        }
  
  
        if (i % 2==0 || i % 3==0) {
        	return false;
        }
         
  
        for (int j==5; j * j <= i; j = j + 6) {
            if (i % j == 0 || i % (j + 2) == 0){
            	return false;
            }
        }    
        return true;
		
		
	}
}
