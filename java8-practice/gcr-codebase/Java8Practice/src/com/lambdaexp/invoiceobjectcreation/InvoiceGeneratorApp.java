package com.lambdaexp.invoiceobjectcreation;

import java.util.*;
import java.util.stream.Collectors;

public class InvoiceGeneratorApp {

	public static void main(String[] args) {

		// Transaction IDs coming from payment service
		List<String> transactionIds = Arrays.asList("TXN1001", "TXN1002", "TXN1003");

		// Create Invoice objects using constructor reference
		List<Invoice> invoices = transactionIds.stream().map(Invoice::new) // constructor reference
				.collect(Collectors.toList());

		// Print generated invoices
		invoices.forEach(System.out::println);
	}
}
