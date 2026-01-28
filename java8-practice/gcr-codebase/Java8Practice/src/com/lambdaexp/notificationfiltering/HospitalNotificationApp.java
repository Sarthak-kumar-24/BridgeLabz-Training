package com.lambdaexp.notificationfiltering;

import java.util.*;
import java.util.function.Predicate;

public class HospitalNotificationApp {

	public static void main(String[] args) {

		List<Alert> alerts = List.of(new Alert("Heart rate critical", "EMERGENCY"),
				new Alert("Take insulin at 8 AM", "MEDICATION"), 
				new Alert("Doctor appointment at 3 PM", "APPOINTMENT"),
				new Alert("Weekly health tips", "INFO"));

		//  User preference: ONLY emergency alerts
		Predicate<Alert> emergencyOnly = alert -> alert.getType().equals("EMERGENCY");

		System.out.println(" Emergency Alerts:");
		alerts.stream().filter(emergencyOnly).forEach(System.out::println);
	}
}
