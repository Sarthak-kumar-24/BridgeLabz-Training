package com.functionalinterfaces.dateformatutility;



import java.time.LocalDate;

/*
 * InvoiceApp
 * ----------
 * Demonstrates date formatting for
 * invoice generation.
 */
public class InvoiceApp {

	public static void main(String[] args) {

		LocalDate invoiceDate = LocalDate.now();

		// Different invoice date formats
		System.out.println("Invoice Date (dd-MM-yyyy): " + DateFormatUtils.formatDate(invoiceDate, "dd-MM-yyyy"));

		System.out.println("Invoice Date (dd/MM/yyyy): " + DateFormatUtils.formatDate(invoiceDate, "dd/MM/yyyy"));

		System.out.println("Invoice Date (yyyy-MM-dd): " + DateFormatUtils.formatDate(invoiceDate, "yyyy-MM-dd"));

		System.out.println("Invoice Date (MMM dd, yyyy): " + DateFormatUtils.formatDate(invoiceDate, "MMM dd, yyyy"));
	}
}
