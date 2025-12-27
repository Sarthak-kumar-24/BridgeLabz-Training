package com.constructor.levelone;


/*
 * Created a class named HotelBooking that 
 * uses default, parameterized, and copy constructors to initialize bookings.
 */
public class HotelBooking {
	//creating instance variables
	private String guestName;
	private String roomType;
	private int nights;
	
	//default constructor
	public HotelBooking() {
		this.guestName ="Vivek Oberoi";
		this.roomType ="A+";
		this.nights =5;
		
	}
	//parameterized constructor
	public HotelBooking(String guestName, String roomType, int nights) {
		
		this.guestName =guestName;
		this.roomType =roomType;
		this.nights = nights;
	}
	//copy constructor
	public HotelBooking( HotelBooking booking2) {
		this.guestName =booking2.guestName;
		this.roomType =booking2.roomType;
		this.nights = booking2.nights;
		
	}
	
	//displays details of guests
    public void displayDetails() {
        System.out.println("Name : " + guestName);
        System.out.println("Nights  : " + nights);
    }

	public static void main(String[] args) {
		
		HotelBooking booking1 = new HotelBooking();
		
		System.out.println("Enter details of 1st guest");
		booking1.displayDetails();
		
		HotelBooking booking2 = new HotelBooking("Raghav Sharma", "B", 2);
		
		System.out.println("details of 2nd guest");
		booking2.displayDetails();
		
		HotelBooking booking3 = new HotelBooking(booking2);
		booking3.displayDetails();

	}

}
