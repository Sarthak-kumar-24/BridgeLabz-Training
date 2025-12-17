// Creating class named EarthVolume to compute the volume of Earth



public class EarthVolume {
    public static void main(String[] args) {

        // Radius of Earth in kilometers
        double radiusKm = 6378;
        // Constant value of PI
        double pi = Math.PI;
        // Conversion factor: 1 km = 0.621371 miles
        double kmToMiles = 0.621371;



        // Volume of sphere formula: (4/3) *  π   *  r^3
        double volumeKmCube = (4.0 / 3.0)  *  pi  *  Math.pow( radiusKm, 3);
        // Converted cubic kilometers to cubic miles
        double volumeMilesCube =  volumeKmCube   *   Math.pow(kmToMiles, 3);



        // Single print statement for multiline output
        System.out.println(
                "The volume of earth in cubic kilometers is " +  volumeKmCube  +
                " and cubic miles is  " +  volumeMilesCube
        );
    }
}
