package com.csvfilehandling.encryptanddecryptCSVdata;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.util.Base64;

//------------------------------------------------------------
//Program Name : EncryptDecryptCSV
//Description  : This program encrypts sensitive CSV fields
//           (Email, Salary) while writing to a CSV file
//           and decrypts them while reading the file.
//Encryption   : AES (Core Java, no Maven)
//Author       : Your Name
//------------------------------------------------------------

public class EncryptDecryptCSV {

	// AES secret key (must be 16 characters for AES-128)
	private static final String SECRET_KEY = "MySecretKey12345";

	public static void main(String[] args) throws Exception {

		writeEncryptedCSV("O:\\New folder\\employees_secure.csv");
		readDecryptedCSV("O:\\New folder\\employees_secure.csv");
	}

	// ------------------------------------------------------------
	// Write CSV with encrypted Email and Salary
	// ------------------------------------------------------------
	private static void writeEncryptedCSV(String file) throws Exception {

		BufferedWriter bw = new BufferedWriter(new FileWriter(file));

		// Write header
		bw.write("ID,Name,Email,Salary");
		bw.newLine();

		// Sample data
		bw.write("101,Amit," + encrypt("amit@gmail.com") + "," + encrypt("55000"));
		bw.newLine();

		bw.write("102,Riya," + encrypt("riya@gmail.com") + "," + encrypt("62000"));
		bw.newLine();

		bw.close();
		System.out.println("Encrypted CSV written successfully.");
	}

	// ------------------------------------------------------------
	// Read CSV and decrypt sensitive fields
	// ------------------------------------------------------------
	private static void readDecryptedCSV(String file) throws Exception {

		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		boolean isHeader = true;

		System.out.println("\nDecrypted CSV Data");
		System.out.println("------------------");

		while ((line = br.readLine()) != null) {

			if (isHeader) {
				isHeader = false;
				continue;
			}

			String[] data = line.split(",");

			String id = data[0];
			String name = data[1];
			String email = decrypt(data[2]);
			String salary = decrypt(data[3]);

			System.out.println("ID=" + id + ", Name=" + name + ", Email=" + email + ", Salary=" + salary);
		}

		br.close();
	}

	// ------------------------------------------------------------
	// Encrypt a string using AES
	// ------------------------------------------------------------
	private static String encrypt(String value) throws Exception {

		SecretKeySpec key = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");

		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.ENCRYPT_MODE, key);

		byte[] encrypted = cipher.doFinal(value.getBytes());

		return Base64.getEncoder().encodeToString(encrypted);
	}

	// ------------------------------------------------------------
	// Decrypt a string using AES
	// ------------------------------------------------------------
	private static String decrypt(String encrypted) throws Exception {

		SecretKeySpec key = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");

		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.DECRYPT_MODE, key);

		byte[] decoded = Base64.getDecoder().decode(encrypted);

		return new String(cipher.doFinal(decoded));
	}
}
