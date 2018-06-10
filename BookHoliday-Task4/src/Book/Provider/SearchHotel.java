package Book.Provider;

import java.util.Scanner;


import Book.Component.Hotel;

public class SearchHotel {
	
	String City;
	String StartTime;
	String EndTime;
	int Room;
	int Peaple;
	String HotelType;

	public SearchHotel() {
	
		Scanner userInput = new Scanner(System.in);
		Hotel hotelinfo=new Hotel();
		
		System.out.println("Find Hotel in: ");
		City=userInput.next();
		
			
		System.out.println("Depart: (d/m/y) ");
		StartTime=userInput.next();
		
		System.out.println("departure: (d/m/y) ");
		EndTime=userInput.next();
		
		System.out.println("how many peapole: ");
		Peaple= Integer.parseInt(userInput.nextLine());
		
		System.out.println("how many Rooms: ");
		Room= Integer.parseInt(userInput.nextLine());
		
		
		
		hotelinfo.setCity(City);
		hotelinfo.setStartTime(StartTime);
		hotelinfo.setEndTime(EndTime);
		hotelinfo.setPeaple(Peaple);
		hotelinfo.setRoom(Room);
		hotelinfo.setHotelType(HotelType);
		
	}
}
