package com.streams.convertimagetobytearray;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ImageByteArrayDemo
 *
 * This program demonstrates how to:
 * 1. Read an image file into a byte array
 * 2. Store image data in memory using ByteArray streams
 * 3. Write the byte array back into a new image file
 * 4. Verify that both image files are identical
 */
public class ImageByteArrayDemo {
	
	   public static void main(String[] args) {

	        // Source and destination image paths
	        String sourceImage = "original.jpg";
	        String destinationImage = "copy.jpg";

	        try {
	            // ---------------- STEP 1 ----------------
	            // Read image file into byte array using FileInputStream
	            FileInputStream fis = new FileInputStream(sourceImage);

	            ByteArrayOutputStream baos = new ByteArrayOutputStream();

	            int data;
	            while ((data = fis.read()) != -1) {
	                baos.write(data);
	            }

	            // Convert ByteArrayOutputStream to byte[]
	            byte[] imageBytes = baos.toByteArray();

	            // Close streams
	            fis.close();
	            baos.close();

	            System.out.println(" Image successfully converted to byte array.");
	            System.out.println("Byte array size: " + imageBytes.length + " bytes");

	            // ---------------- STEP 2 ----------------
	            // Write byte array back to a new image file
	            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
	            FileOutputStream fos = new FileOutputStream(destinationImage);

	            while ((data = bais.read()) != -1) {
	                fos.write(data);
	            }

	            // Close streams
	            bais.close();
	            fos.close();

	            System.out.println(" Byte array written back to new image file.");

	            // ---------------- STEP 3 ----------------
	            // Verify both files are identical
	            if (compareFiles(sourceImage, destinationImage)) {
	                System.out.println(" Verification successful: Images are identical.");
	            } else {
	                System.out.println(" Verification failed: Images are NOT identical.");
	            }

	        } catch (IOException e) {
	            System.out.println(" I/O Error occurred: " + e.getMessage());
	        }
	    }

	    /**
	     * Compares two files byte-by-byte
	     * Returns true if files are identical
	     */
	    private static boolean compareFiles(String file1, String file2) throws IOException {

	        FileInputStream f1 = new FileInputStream(file1);
	        FileInputStream f2 = new FileInputStream(file2);

	        int b1, b2;

	        while (true) {
	            b1 = f1.read();
	            b2 = f2.read();

	            // If bytes differ, files are not identical
	            if (b1 != b2) {
	                f1.close();
	                f2.close();
	                return false;
	            }

	            // If end of file reached for both
	            if (b1 == -1) {
	                break;
	            }
	        }

	        f1.close();
	        f2.close();
	        return true;
	    }

}
