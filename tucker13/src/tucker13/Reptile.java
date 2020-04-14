package tucker13;

import java.util.Date;

public class Reptile extends Pet implements Move {
	//declare fields
	private String type;
	//constructor that invokes the parent class constructor
	public Reptile(String name, char gender, Date acquired, String reptileType) {
		super(name, gender, acquired);
		this.type = reptileType;
	}
	//overwrites base class methods
	@Override
	public String move() {
		
		return "Must be caged, crawls or slithers.";
	}

	@Override
	public String sound() {
		
		return "Not much sound, maybe a hiss";
	}
	
	@Override
	public String toString() {
		return "Reptile name = " + name + ", " + type + ", " + gender + "\n"
				+ move() + "\n" + sound() + ", acquired " + acquired;
	}

}
