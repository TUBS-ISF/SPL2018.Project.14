import java.util.Arrays;
import java.util.List;

import properties.PropertyManager;
public class Main {

	public static void main(String[] args) {
		

		if (PropertyManager.getProperty("BookEntertaiment")) {
			System.out.println("Entertaiment schon gebucht");
								
		}

		if (PropertyManager.getProperty("BookingFlight")) {
			System.out.println("Flight schon gebucht");
											
		}

		if (PropertyManager.getProperty("PayOff")) {
			System.out.println("schon bezahlt");
	
	}

		if (PropertyManager.getProperty("SearchHotel")) {
			System.out.println("sucht nach einen Zimmer");

  }
 
	}

}
