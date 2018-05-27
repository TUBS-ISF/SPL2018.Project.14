package Book.Provider;

import java.util.Scanner;

import Book.Component.Flight;

public class SearchFlight {
 
	String FromCity;
	String ToCity;
	String StartTime;
	String EndTime;
	
	

	
	public SearchFlight() {
		
		Scanner userInput = new Scanner(System.in);
		Flight Flightinfo=new Flight();
		
		System.out.println("From City: ");
		FromCity=userInput.next();
		
		System.out.println("To City: ");
		ToCity=userInput.next();
		
		System.out.println("Depart: (d/m/y) ");
		StartTime=userInput.next();
		
		System.out.println("Return: (d/m/y) ");
		EndTime=userInput.next();
		
	
		
	}

}
