import java.io.IOException;
import properties.PropertyManager;

public class Main {

	public static void main(String[] args) throws IOException {
		

		if (PropertyManager.getProperty("BookEntertaiment")) {
			System.out.println("Entertaiment schon gebucht.");
								
		}

		if (PropertyManager.getProperty("BookingFlight")) {
			System.out.println("Flight hat schon gebucht");
											
		}

		if (PropertyManager.getProperty("PayOff")) {
			System.out.println("der User hat schon bezahlt."
					+ "");
	
	}

		if (PropertyManager.getProperty("SearchHotel")) {
			System.out.println("sucht nach einen Zimmer");

  }
 
	}

}
