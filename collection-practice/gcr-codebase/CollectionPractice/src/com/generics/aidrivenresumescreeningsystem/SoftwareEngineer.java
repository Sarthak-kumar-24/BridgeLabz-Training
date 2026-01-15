package com.generics.aidrivenresumescreeningsystem;

public class SoftwareEngineer extends JobRole {
	SoftwareEngineer() {
		super("Software Engineer");
	}

	@Override
	void screenResume() {
		System.out.println(roleName + ": Checking DSA, OOPs, System Design, Coding Skills");
	}

}
