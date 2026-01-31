package com.streamAPI.filteringexpiringmemberships;



import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/*
 * MembershipExpiryChecker
 * -----------------------
 * Filters gym members whose membership
 * expires within the next 30 days.
 */
public class MembershipExpiryChecker {

    public static void main(String[] args) {

        List<GymMember> members = Arrays.asList(
                new GymMember("Rahul", LocalDate.now().plusDays(10)),
                new GymMember("Amit", LocalDate.now().plusDays(45)),
                new GymMember("Sneha", LocalDate.now().plusDays(25)),
                new GymMember("Priya", LocalDate.now().minusDays(2)),
                new GymMember("Karan", LocalDate.now().plusDays(30))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        // Stream processing
        List<GymMember> expiringSoonMembers = members.stream()

                // Filter memberships expiring within next 30 days
                .filter(member ->
                        !member.getExpiryDate().isBefore(today) &&
                         member.getExpiryDate().isBefore(next30Days.plusDays(1))
                )

                .collect(Collectors.toList());

        // Display result
        System.out.println(" Members with memberships expiring within 30 days:");
        expiringSoonMembers.forEach(System.out::println);
    }
}
