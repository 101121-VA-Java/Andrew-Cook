package models;

public class Tacos {

	public Tacos() {
		public String[] ingredients = {"ground beef", "cheese","tortilla"};   // Inheritance
		
		
	    boolean mostPopular(String month) { // example of overriding a method
	        if (month.equals("March")) {
	            return false;
	        }
	        return true;
	    }
	    
	    public void threeMonths(){
	        System.out.println("The weather is going to be very harsh for the next three months");
	}

}
