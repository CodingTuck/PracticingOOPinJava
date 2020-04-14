package tucker13;

import java.text.NumberFormat;

public class Automobile implements Comparable<Automobile> {
	//first give the class data fields for make, model, year, price
	private String make;
	private String model;
	private int year;
	private double price;

	//add a constructor
	public Automobile(String carMake, String carModel, int carYear, double carPrice) {
		
		this.make = carMake;
		this.model = carModel;
		this.year = carYear;
		this.price = carPrice;	
	}
	
	//add all getters
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public double getPrice() {
		return price;
	}
	
	//to string method.. @Override since we are implementing the comparable interface and not using and Abstract Class
	@Override
	public String toString() {
		NumberFormat formatPrice = NumberFormat.getCurrencyInstance();
		
		return "[Make]: " + make + " [Model]: " + model + " [Year]: " + year +
				" [Price]: " + formatPrice.format(price);
	}
	
	//Implement Comparable by using the year as the criterion for comparing instances
	public int compareTo(Automobile auto) {
		if (this.year < auto.year) {
			return -1;
		}
		
		else if (this.year > auto.year) {
			return 1;
		}
		
		else {
			return 0;
		}
	}
}