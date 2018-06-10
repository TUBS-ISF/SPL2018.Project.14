import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import Book.Component.Flight;
import Book.Component.Hotel;
import Book.Provider.*;
import Book.customer.*;
import Interfaces.*;
import loader.PluginLoader;


public class Main {
	
	
	

	public static void main(String[] args) throws IOException {
		
		List<iSearch> Fluginf = PluginLoader.load(iSearch.class);
		setInfo(Fluginf, true);
		
		List<iHotel> Hotelinf = PluginLoader.load(iHotel.class);
		setHotelInfo(Hotelinf, true);
		
		
	
	
	System.out.println("  ---------------- Wellcome to Holiday Booking ---------------------- ");
	 while(true) {
		
		
		System.out.println("1. Search Flight: ");
		  
		 
		 //#if SearchHotel
		 System.out.println("2. Search Hotel: ");
		//#endif  
		 
		 //#if RentCar
		 System.out.println("3. Rent Car or Book Entermaint: ");
			//#endif
		//#if Payment
		 System.out.println("4. Make Payment");
		//#endif
		 
		 System.out.println("5. Exit");
		 System.out.println("---------------------------");
		 System.out.println("Please Enter Your Choice:");
		 
			Scanner userInput = new Scanner(System.in);
			int choice = userInput.nextInt();
			
			switch(choice) {
			case 1:
				 SearchFlight sf= new SearchFlight();
				break;
			
			case 2:
				SearchHotel sh=new SearchHotel();
				break;
				
			case 3:
				AddProvider ap=new AddProvider();
				break;
			case 4:
				userInput = new Scanner(System.in);
				System.out.println("Enter Full Name: ");			
				String fullName = userInput.next();
				System.out.println("Enter Email: ");			
				String email = userInput.next();
				System.out.println("Enter Phone No: ");			
				String phone = userInput.next();
				System.out.println("Enter Crad Detail: ");			
				String cardDetail = userInput.next();
				
				CustomerInfo custInfo = new CustomerInfo();
				//custInfo.setUsername(userInfo.getUserName());
				custInfo.setFullName(fullName);
				custInfo.setEmail(email);
				custInfo.setContactNum(phone);
				custInfo.setCardDetail(cardDetail);
				//String confirmationMsg = serviceProvider.makePayment(hpPackage.getId(), custInfo);
	     //    	System.out.println(confirmationMsg);
				break;
			default:
				System.out.println("Please enter correct Choice");
			}
			
			if(choice == 5)
				break;
			}
			
			System.out.println("*********************Thank You*********************");
		}
		 

	private static void setInfo( List<iSearch> Fluginf, Boolean bla) {
	Flight flight=new Flight();
	
	for(iSearch search : Fluginf) {
		switch(search.getFlugType())
		{
		case FirstClass:
			flight.setCarrierName("FirstClass");
			break;
			
		case Economy:
			flight.setCarrierName("Economy");
			break;
		}
	}

}
	
	private static void setHotelInfo( List<iHotel> Hotelinf, Boolean bla) {
		Hotel hotel= new Hotel();
		
		for(iHotel search : Hotelinf) {
			switch(search.getHotelType())
			{
			case Lux:
				hotel.setHotelType("Lux");
				break;
				
			case Economy:
				hotel.setHotelType("Economy");
				break;
			}
		}

	}
	
	}
	
