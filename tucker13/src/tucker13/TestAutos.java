package tucker13;

import java.util.ArrayList;
import java.util.Collections;

public class TestAutos {
		
	public static void main (String[] args) {
		//make an arraylist for 5 or 6 automobiles.. in this case these are all the cars I've owned
		ArrayList<Automobile> testAuto = new ArrayList<>();
		
		testAuto.add(new Automobile("Toyota", "Highlander", 2009, 13000));
		testAuto.add(new Automobile("Toyota", "Corolla", 2013, 10000));
		testAuto.add(new Automobile("Mazda", "3", 2005, 3800));
		testAuto.add(new Automobile("Honda", "Accord", 2003, 2700));
		testAuto.add(new Automobile("Chevy", "Cavalier", 2005, 3200));
		testAuto.add(new Automobile("Honda", "Civic", 1992, 1700));
		
		//for loop to display elements in the arraylist.
		for(int numAutos = 0; numAutos < testAuto.size(); numAutos++) {
			System.out.println(testAuto.get(numAutos));
		}
		
		System.out.println("\n Sort the list by Automobile year: \n");
		
		//Sort ArrayList by year of automobile using Collections
		Collections.sort(testAuto);
		
		//foreach loop that uses the Automobile class to display the ArrayList
		for(Automobile autoList : testAuto) {
			System.out.println(autoList);
		}
	}
		
}
