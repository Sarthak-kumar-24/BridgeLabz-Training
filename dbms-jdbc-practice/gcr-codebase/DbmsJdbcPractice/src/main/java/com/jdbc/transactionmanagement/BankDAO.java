package com.jdbc.transactionmanagement;

import java.sql.*;

/*
 * Handles all banking database operations
 */
public class BankDAO {

	/*
	 * Checks account balance
	 */
	public void checkBalance(int accountId) {

		String sql = "SELECT balance FROM account WHERE account_id = ?";

		try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

			ps.setInt(1, accountId);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				System.out.println("Balance: " + rs.getDouble("balance"));
			} else {
				System.out.println("Account not found!");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/*
	 * Transfers money between two accounts using TRANSACTION
	 */
	public void transferMoney(int fromAcc, int toAcc, double amount) {

		String debitSQL = "UPDATE account SET balance = balance - ? WHERE account_id = ?";
		String creditSQL = "UPDATE account SET balance = balance + ? WHERE account_id = ?";
		String historySQL = "INSERT INTO transaction_history(from_account, to_account, amount) VALUES (?, ?, ?)";

		Connection conn = null;

		try {
			conn = DBConnection.getConnection();

			//  Start transaction
			conn.setAutoCommit(false);

			// Debit sender
			PreparedStatement debitStmt = conn.prepareStatement(debitSQL);
			debitStmt.setDouble(1, amount);
			debitStmt.setInt(2, fromAcc);
			debitStmt.executeUpdate();

			// Credit receiver
			PreparedStatement creditStmt = conn.prepareStatement(creditSQL);
			creditStmt.setDouble(1, amount);
			creditStmt.setInt(2, toAcc);
			creditStmt.executeUpdate();

			// Save transaction history
			PreparedStatement historyStmt = conn.prepareStatement(historySQL);
			historyStmt.setInt(1, fromAcc);
			historyStmt.setInt(2, toAcc);
			historyStmt.setDouble(3, amount);
			historyStmt.executeUpdate();

			//  Commit transaction
			conn.commit();

			System.out.println("Transfer successful!");

		} catch (SQLException e) {

			try {
				if (conn != null) {
					//  Rollback on error
					conn.rollback();
					System.out.println("Transfer failed! Transaction rolled back.");
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}

			e.printStackTrace();

		} finally {
			try {
				if (conn != null) {
					conn.setAutoCommit(true); // Reset auto-commit
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/*
	 * Displays transaction history
	 */
	public void showTransactionHistory() {

		String sql = "SELECT * FROM transaction_history";

		try (Connection conn = DBConnection.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			while (rs.next()) {
				System.out.println("TxnID: " + rs.getInt("txn_id") + " | From: " + rs.getInt("from_account") + " | To: "
						+ rs.getInt("to_account") + " | Amount: " + rs.getDouble("amount") + " | Time: "
						+ rs.getTimestamp("txn_time"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
