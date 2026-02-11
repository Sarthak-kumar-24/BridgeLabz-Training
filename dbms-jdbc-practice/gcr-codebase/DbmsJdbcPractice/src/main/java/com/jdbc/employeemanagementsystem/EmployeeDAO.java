package com.jdbc.employeemanagementsystem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*
 * DAO = Data Access Object
 * This class handles all database operations
 */
public class EmployeeDAO {

    /*
     * Adds a new employee to the database
     */
    public void addEmployee(Employee emp) {

        String sql = "INSERT INTO employee(name, salary) VALUES (?, ?)";

        try (
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ) {

            ps.setString(1, emp.getName());   // Set name
            ps.setDouble(2, emp.getSalary()); // Set salary

            ps.executeUpdate(); // Execute insert query
            System.out.println("Employee added successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*
     * Displays all employees
     */
    public void viewAllEmployees() {

        String sql = "SELECT * FROM employee";

        try (
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)
        ) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getDouble("salary")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*
     * Updates salary of an employee by ID
     */
    public void updateSalary(int id, double newSalary) {

        String sql = "UPDATE employee SET salary = ? WHERE id = ?";

        try (
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ) {

            ps.setDouble(1, newSalary);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Salary updated successfully!");
            else
                System.out.println("Employee not found!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*
     * Deletes employee by ID
     */
    public void deleteEmployee(int id) {

        String sql = "DELETE FROM employee WHERE id = ?";

        try (
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Employee deleted successfully!");
            else
                System.out.println("Employee not found!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*
     * Searches employee by name
     */
    public void searchEmployeeByName(String name) {

        String sql = "SELECT * FROM employee WHERE name LIKE ?";

        try (
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ) {

            ps.setString(1, "%" + name + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getDouble("salary")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
