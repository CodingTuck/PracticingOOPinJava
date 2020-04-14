package tucker13;

import java.util.Date;

//specifies the superclass Pet and implements the interface Move and inputs a method that sorts dog by weight
public class Dog extends Pet implements Move, Comparable<Dog> {
	//declare fields
	private String breed;
	private int weight;
	//constructor that refers to the Pet superclass constructor
	public Dog(String name, char gender, Date acquired, String dogBreed, int dogWeight) {
		super(name, gender, acquired);
		this.breed = dogBreed;
		this.weight = dogWeight;
	}
	//getters
	public String getBreed() {
		return breed;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public String move() {
		return "Walks on a leash";
	}
	
	//overwrite the base class method
	@Override
	public String sound() {
		return "Barks or howls";
	}
	
	@Override
	public String toString() {
		
		return "Dog name = " + name + ", " + breed + ", " + gender + "\n"
				+ move() + ", weight " + weight + "lbs \n" +
				sound() + ", acquired " + acquired;
	}
	//sorts dogweight in ascending order
	@Override
	public int compareTo(Dog dogWeight) {
		
		if (this.weight < dogWeight.weight) {
			return -1;
		}
		
		else if (this.weight > dogWeight.weight) {
			return 1;
		}
		
		else {
			return 0;
		}
	}
}
