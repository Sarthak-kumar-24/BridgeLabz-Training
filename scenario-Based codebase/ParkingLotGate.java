import java.util.Scanner;


/*
Parking Lot Gate System 
Develop a smart parking system.
 Options: Park, Exit, Show Occupancy
 Use switch-case for the menu.
 while loop to continue until the parking lot is full or the user exits.
*/
public class ParkingLotGate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
                // setting max capacity of the parking lot
		final int MAX_CAPACITY=15;
		boolean parkingLot= true;
		int currentVehicles = 0;
		
		System.out.println("Welcome to Smart Parking Lot System");
		
              //loop to give menu 
		while (parkingLot && currentVehicles < MAX_CAPACITY) {

                    System.out.println("\nChoose an option:");
                    System.out.println("1. Park Vehicle");
                   System.out.println("2. Remove Vehicle");
                   System.out.println("3. Show Occupancy");
                  System.out.println("4. Exit System");
            
                   System.out.print("Enter your choice: ");
                   int choice = sc.nextInt();
            
            
                  switch(choice) {
            
                  case 1:
            	      if(currentVehicles < MAX_CAPACITY) {
            		currentVehicles++;
            		System.out.println("Your Vehucle is parked!");
            		
            	   }else {
            		System.out.println("Parking Lot is Already Full! ");
            	   }
                    break;
            

                case 2:
        	
            	   if(currentVehicles > 0) {
        		currentVehicles--;
        		System.out.println("Your Vehucle is Removed!");
        		
            	   }    else{
        		System.out.println("First Park your vehicle to remove!");
                   }
                          
                     break;    	
            	 
         
             case 3:
    	
            	if(currentVehicles > 0) {
    		
            		System.out.println("Total parking Space: " + MAX_CAPACITY);   		
            		System.out.println("Total parked vehicles: " + currentVehicles);		
            		System.out.println("Total Space left: " +  (MAX_CAPACITY - currentVehicles) );
    		
    	     }
                   break;
    


            case 4:
	
                    System.out.println("You exited the System!");
                    parkingLot = false;
                     break;

	
          default:
                    System.out.println("Invalid choice. Try again.");
          }
        }

        if (currentVehicles == MAX_CAPACITY) {
            System.out.println("\nParking Lot is FULL ");
        }


     sc.close();


	}
}