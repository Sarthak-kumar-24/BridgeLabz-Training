package com.tourmate;

/* TourMate – Travel Itinerary Planner
 * 
 * Trip class: destination, budget, duration.
 * Transport, Hotel, Activity are associated.
 * Interface IBookable with book() and cancel() methods.
 * Encapsulation: hide cost breakdown inside services.
 * Inheritance: InternationalTrip, DomesticTrip extend Trip.
 * 
 */
public abstract class Trip implements IBookable {

    protected String destination;
    protected int duration; // days
    private double hotelCost;
    private double transportCost;
    private double activityCost;

    public Trip(String destination, int duration,
                double hotelCost, double transportCost, double activityCost) {
        this.destination = destination;
        this.duration = duration;
        this.hotelCost = hotelCost;
        this.transportCost = transportCost;
        this.activityCost = activityCost;
    }

    protected double totalBudget() {
        return hotelCost + transportCost + activityCost;
    }

    protected void printCostBreakdown() {
        System.out.println(" Hotel Cost      : Rs" + hotelCost);
        System.out.println(" Transport Cost  : Rs" + transportCost);
        System.out.println(" Activities Cost : Rs" + activityCost);
    }
    private static void printHeader() {
        System.out.println("=================================================");
        System.out.println("               TourMate Planner ");
        System.out.println("        Smart Travel Itinerary Management");
        System.out.println("=================================================\n");
    }

    private static void printSection(String title) {
        System.out.println("\n-------------------------------------------------");
        System.out.println(" " + title);
        System.out.println("-------------------------------------------------");
    }

    private static void printFooter() {
        System.out.println("\n=================================================");
        System.out.println("Thank you for choosing TourMate ");
        System.out.println("Plan smart. Travel better.");
        System.out.println("=================================================");
    }
    
    public static void main(String[] args) {

        printHeader();

        Trip domestic = new DomesticTrip(
                "Goa",
                5,
                15000,
                5000,
                4000
        );

        Trip international = new InternationalTrip(
                "Paris",
                7,
                45000,
                35000,
                20000
        );

        // Domestic Trip
        printSection("DOMESTIC TRIP DETAILS");
        System.out.println(" Destination : " + domestic.destination);
        System.out.println(" Duration    : " + domestic.duration + " days");
        domestic.printCostBreakdown();
        System.out.println(" Total Budget : Rs" + domestic.totalBudget());
        domestic.book();

        // International Trip
        printSection("INTERNATIONAL TRIP DETAILS");
        System.out.println(" Destination : " + international.destination);
        System.out.println(" Duration    : " + international.duration + " days");
        international.printCostBreakdown();
        System.out.println(" Total Budget : Rs" + international.totalBudget());
        international.book();

        printFooter();
    }
}
