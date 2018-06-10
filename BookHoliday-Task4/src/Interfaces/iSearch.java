package Interfaces;

import Book.Provider.SearchFlight;
import Book.Provider.SearchHotel;

public interface iSearch {
	
	public enum FlugType{
		FirstClass,
		Economy
	}
	 
	

	public FlugType getFlugType();
}
