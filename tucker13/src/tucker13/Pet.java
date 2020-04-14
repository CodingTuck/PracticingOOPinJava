package tucker13;

import java.util.Date;

public abstract class Pet {
	//declare fields. use of protected because they can only be accessed by classes within this package
	protected String name;
	protected char gender;
	protected Date acquired = new Date();
	
	//declare constructor Pet
	public Pet(String petName, char petGender, Date acquiredPet) {
		this.name = petName;
		this.gender = petGender;
		this.acquired = acquiredPet;
	}
	
	//the getters
	public String getName() {
		return name;
	}
	
	public char getGender() {
		return gender;
	}
	
	public Date getAcquiredDate() {
		return acquired;
	}
	
	//the derived classes implement this abstract method of sound
	public abstract String sound();

}
