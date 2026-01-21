package com.streams.storeandretrieveprimitivedata;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * StudentDataStreamDemo
 *
 * This program demonstrates the use of: - DataOutputStream to store primitive
 * data - DataInputStream to retrieve primitive data
 *
 * Student details stored: - Roll Number (int) - Name (String) - GPA (double)
 *
 * Data is written to and read from a binary file.
 */
public class StudentDataStreamDemo {

	public static void main(String[] args) {

		// Binary file name
		String fileName = "student.dat";

		// Sample student data
		int rollNumber = 101;
		String name = "Sarthak";
		double gpa = 8.72;

		// ---------- WRITING DATA ----------
		System.out.println(" Writing student data to file...");

		try (
				// DataOutputStream writes primitive data in binary form
				DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
			// Write data in a fixed order
			dos.writeInt(rollNumber);
			dos.writeUTF(name);
			dos.writeDouble(gpa);

			System.out.println(" Student data written successfully.\n");

		} catch (IOException e) {
			System.out.println(" Error while writing data: " + e.getMessage());
		}

		// ---------- READING DATA ----------
		System.out.println(" Reading student data from file...");

		try (
				// DataInputStream reads primitive data in the same order
				DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
			// Read data in the SAME order as written
			int readRoll = dis.readInt();
			String readName = dis.readUTF();
			double readGpa = dis.readDouble();

			System.out.println(" Student data retrieved successfully.\n");

			// Display retrieved data
			System.out.println(" Student Details:");
			System.out.println("Roll Number : " + readRoll);
			System.out.println("Name        : " + readName);
			System.out.println("GPA         : " + readGpa);

		} catch (IOException e) {
			System.out.println(" Error while reading data: " + e.getMessage());
		}
	}

}
