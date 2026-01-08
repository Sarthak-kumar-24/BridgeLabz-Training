package com.tourmate;

public class DomesticTrip extends Trip {

    public DomesticTrip(String destination, int duration,
                        double hotelCost, double transportCost, double activityCost) {
        super(destination, duration, hotelCost, transportCost, activityCost);
    }

    @Override
    public void book() {
        System.out.println("🇮🇳 Domestic Trip Booked Successfully");
    }

    @Override
    public void cancel() {
        System.out.println(" Domestic Trip Cancelled");
    }
}
