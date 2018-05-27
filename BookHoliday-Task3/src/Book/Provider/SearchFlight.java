package Book.Provider;

import java.util.Scanner;
import Book.Component.Flight;

public class SearchFlight {


	
	public SearchFlight() {
		
		Scanner userInput = new Scanner(System.in);
		Flight Flightinfo=new Flight();
		
		System.out.println("From City: ");
		Flightinfo.setFromCity("knldfs");
		System.out.println("To City: ");
		System.out.println("Depart: (d/m/y) ");
		System.out.println("Return: (d/m/y) ");
		System.out.println("Travels: ");
	}

}
