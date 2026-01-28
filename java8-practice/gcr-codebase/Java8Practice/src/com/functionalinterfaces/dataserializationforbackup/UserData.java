package com.functionalinterfaces.dataserializationforbackup;

import java.io.Serializable;

/*
 * UserData
 * --------
 * Represents user data that should
 * be backed up.
 */
public class UserData implements Backupable, Serializable {

	private static final long serialVersionUID = 1L;

	private String username;
	private String email;

	public UserData(String username, String email) {
		this.username = username;
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserData [username=" + username + ", email=" + email + "]";
	}
}
