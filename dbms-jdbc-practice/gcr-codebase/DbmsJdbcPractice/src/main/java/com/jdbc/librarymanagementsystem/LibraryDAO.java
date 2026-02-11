package com.jdbc.librarymanagementsystem;

import java.sql.*;
import java.time.LocalDate;

/*
 * Handles all library operations
 */
public class LibraryDAO {

    /*
     * Adds a new book to inventory
     */
    public void addBook(String title, String author, String category, int copies) {

        String sql = "INSERT INTO book(title, author, category, total_copies, available_copies) VALUES (?, ?, ?, ?, ?)";

        try (
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ) {
            ps.setString(1, title);
            ps.setString(2, author);
            ps.setString(3, category);
            ps.setInt(4, copies);
            ps.setInt(5, copies);

            ps.executeUpdate();
            System.out.println("Book added successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*
     * Borrow a book
     */
    public void borrowBook(int studentId, int bookId) {

        String checkSQL = "SELECT available_copies FROM book WHERE book_id = ?";
        String updateBookSQL = "UPDATE book SET available_copies = available_copies - 1 WHERE book_id = ?";
        String insertBorrowSQL = "INSERT INTO borrow(student_id, book_id, borrow_date) VALUES (?, ?, ?)";

        try (Connection conn = DBConnection.getConnection()) {

            PreparedStatement checkStmt = conn.prepareStatement(checkSQL);
            checkStmt.setInt(1, bookId);
            ResultSet rs = checkStmt.executeQuery();

            if (rs.next() && rs.getInt("available_copies") > 0) {

                PreparedStatement updateStmt = conn.prepareStatement(updateBookSQL);
                updateStmt.setInt(1, bookId);
                updateStmt.executeUpdate();

                PreparedStatement borrowStmt = conn.prepareStatement(insertBorrowSQL);
                borrowStmt.setInt(1, studentId);
                borrowStmt.setInt(2, bookId);
                borrowStmt.setDate(3, Date.valueOf(LocalDate.now()));
                borrowStmt.executeUpdate();

                System.out.println("Book borrowed successfully!");
            } else {
                System.out.println("Book not available!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*
     * Return book and calculate fine
     * Fine: Rs10 per day after 7 days
     */
    public void returnBook(int borrowId) {

        String fetchSQL = "SELECT borrow_date, book_id FROM borrow WHERE borrow_id = ?";
        String updateBorrowSQL = "UPDATE borrow SET return_date = ? WHERE borrow_id = ?";
        String updateBookSQL = "UPDATE book SET available_copies = available_copies + 1 WHERE book_id = ?";

        try (
            Connection conn = DBConnection.getConnection();
            PreparedStatement fetchStmt = conn.prepareStatement(fetchSQL)
        ) {

            fetchStmt.setInt(1, borrowId);
            ResultSet rs = fetchStmt.executeQuery();

            if (rs.next()) {

                LocalDate borrowDate = rs.getDate("borrow_date").toLocalDate();
                LocalDate returnDate = LocalDate.now();

                long days = java.time.temporal.ChronoUnit.DAYS.between(borrowDate, returnDate);
                long fine = days > 7 ? (days - 7) * 10 : 0;

                PreparedStatement updateBorrow = conn.prepareStatement(updateBorrowSQL);
                updateBorrow.setDate(1, Date.valueOf(returnDate));
                updateBorrow.setInt(2, borrowId);
                updateBorrow.executeUpdate();

                PreparedStatement updateBook = conn.prepareStatement(updateBookSQL);
                updateBook.setInt(1, rs.getInt("book_id"));
                updateBook.executeUpdate();

                System.out.println("Book returned. Fine: Rs" + fine);
            } else {
                System.out.println("Borrow record not found!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*
     * Search books using multiple filters
     */
    public void searchBooks(String title, String author, String category) {

        String sql = "SELECT * FROM book WHERE title LIKE ? AND author LIKE ? AND category LIKE ?";

        try (
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ) {

            ps.setString(1, "%" + title + "%");
            ps.setString(2, "%" + author + "%");
            ps.setString(3, "%" + category + "%");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                    rs.getInt("book_id") + " | " +
                    rs.getString("title") + " | " +
                    rs.getString("author") + " | " +
                    rs.getString("category") + " | Available: " +
                    rs.getInt("available_copies")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
