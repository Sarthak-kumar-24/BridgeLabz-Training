package com.lambdaexp.hospitalpatientidprinting;

import java.util.*;

public class HospitalAdminApp {

	public static void main(String[] args) {

		// List of patient IDs
		List<String> patientIds = Arrays.asList("PAT101", "PAT102", "PAT103", "PAT104");
		
		//patientIds.forEach(id -> System.out.println(id));
		// Printing all patient IDs using method reference
		patientIds.forEach(System.out::println);
	}
}
