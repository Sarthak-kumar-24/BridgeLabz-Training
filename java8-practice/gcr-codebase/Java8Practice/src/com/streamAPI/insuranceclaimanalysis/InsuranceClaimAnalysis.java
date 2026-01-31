package com.streamAPI.insuranceclaimanalysis;

import java.util.*;
import java.util.stream.Collectors;

/*
 * InsuranceClaimAnalysis
 * ---------------------
 * Calculates average claim amount
 * for each claim type using Stream API.
 */
public class InsuranceClaimAnalysis {

	public static void main(String[] args) {

		List<Claim> claims = Arrays.asList(new Claim("Health", 50000), 
				new Claim("Vehicle", 30000),
				new Claim("Health", 70000), 
				new Claim("Life", 100000), 
				new Claim("Vehicle", 45000),
				new Claim("Health", 60000), 
				new Claim("Life", 120000));

		// Stream processing: group by claim type and calculate average amount
		Map<String, Double> averageClaimAmountByType = claims.stream()
				.collect(Collectors.groupingBy(Claim::getClaimType, Collectors.averagingDouble(Claim::getAmount)));

		// Display results
		System.out.println(" Average Claim Amount by Type:");
		averageClaimAmountByType.forEach((type, avgAmount) -> System.out.println(type + " -> Rs" + avgAmount));
	}
}
