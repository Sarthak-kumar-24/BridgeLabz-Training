package com.generics.aidrivenresumescreeningsystem;

public class DataScientist extends JobRole {
	DataScientist() {
		super("Data Scientist");
	}

	@Override
	void screenResume() {
		System.out.println(roleName + ": Checking Statistics, ML, Python, Data Analysis");
	}

}
