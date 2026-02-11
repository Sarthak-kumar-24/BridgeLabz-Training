package com.jdbc.transactionmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Handles database connection creation
 */
public class DBConnection {

	// JDBC URL
	private static final String URL = "jdbc:mysql://localhost:3306/bank_db";

	// DB username
	private static final String USER = "sarthak";

	// DB password
	private static final String PASSWORD = "root";

	/*
	 * Returns an active DB connection
	 */
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
}
