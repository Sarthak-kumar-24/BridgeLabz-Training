package com.resumeanalyze;

import java.util.List;

/**
 * ResumeData ----------- Model class that stores all extracted information from
 * a candidate's resume such as email, phone, matched skills, and keyword match
 * count.
 */
public class ResumeData {

	private String email;
	private String phone;
	private List<String> skills;
	private int keywordCount;

	public ResumeData(String email, String phone, List<String> skills, int keywordCount) {
		this.email = email;
		this.phone = phone;
		this.skills = skills;
		this.keywordCount = keywordCount;
	}

	public String getEmail() {
		return email;
	}

	public int getKeywordCount() {
		return keywordCount;
	}

	@Override
	public String toString() {
		return "Email: " + email + "\nPhone: " + phone + "\nSkills: " + skills + "\nKeyword Matches: " + keywordCount;
	}
}
