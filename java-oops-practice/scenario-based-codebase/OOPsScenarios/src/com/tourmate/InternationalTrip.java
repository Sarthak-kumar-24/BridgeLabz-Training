package com.tourmate;

public class InternationalTrip extends Trip {

    public InternationalTrip(String destination, int duration,
                             double hotelCost, double transportCost, double activityCost) {
        super(destination, duration, hotelCost, transportCost, activityCost);
    }

    @Override
    public void book() {
        System.out.println(" International Trip Booked (Visa & Insurance Included)");
    }

    @Override
    public void cancel() {
        System.out.println(" International Trip Cancelled (Cancellation Charges Applied)");
    }
}
