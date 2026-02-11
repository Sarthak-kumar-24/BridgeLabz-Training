package com.jdbc.employeemanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	// Database URL
    private static final String URL = "jdbc:mysql://localhost:3306/employee_db";

    // Database username
    private static final String USER = "sarthak";

    // Database password
    private static final String PASSWORD = "root";
    
    /*
     * This method establishes and returns
     * a connection to the database
     */
    public static Connection getConnection() throws SQLException {

        // DriverManager connects Java application to database
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }


}
