package tucker13;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class TestPet {
	
	public static void main (String[] args) {
		//initialize the current date to be used in the array
		Date currentDate = Calendar.getInstance().getTime();
		//create an object of Reptile
		Reptile reptilePet = new Reptile("Slinky", 'M', currentDate, "Rock Python");
		
		System.out.println(reptilePet + "\n");
		//an array that invokes the parameters of the Dog constructor and holds its values.
		Dog[] arrDog = new Dog[5];
		arrDog[0] = new Dog("Lucy", 'G', currentDate, "Australian Shepherd Mix", 50);
		arrDog[1] = new Dog("Dixie", 'G', currentDate, "Australian Shepherd Mix", 45);
		arrDog[2] = new Dog("Riley", 'G', currentDate, "German Shepherd", 120);
		arrDog[3] = new Dog("Lily", 'G', currentDate, "Bichon Frise", 12);
		arrDog[4] = new Dog("Oliver", 'M', currentDate, "Chihuahua/Yorkie Mix", 10);
		//sort dogs by weight
		Arrays.sort(arrDog);
		//foreach that displays all data by dogs by weight
		for(Dog dogSort : arrDog) {
			System.out.println(dogSort + "\n");
		}
		
	}

}
