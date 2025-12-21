import java.util.Scanner;

/*
created a class named OTPGenerator that is 
 generates a 6-digit OTP using Math.random(),
stores 10 generated OTPs in an array, and checks whether
all generated OTPs are unique.
*/

public class OTPGenerator{

   //Generates a 6-digit OTP using Math.random().
   public static int generateOTP() {


      return (int) (Math.random() * 900000) + 100000;

   }

   //Checks whether all OTPs in the array are unique.
   public static boolean areOTPsUnique(int[] otps) {


        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }

      return true;
   }



   public static void main(  String[] args  ) {

       // Array to store 10 OTPs
        int[] otps = new int[10];

        // Generate OTPs
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // Display generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Check uniqueness
        boolean unique = areOTPsUnique(otps);

        // Display result
        if (unique) {
            System.out.println("All OTPs are UNIQUE.");
        } else {
            System.out.println("Duplicate OTPs found.");
        }
   }
}