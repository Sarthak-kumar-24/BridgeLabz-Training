package com.lambdaexp.invoiceobjectcreation;

/**
 * Invoice model used in billing and finance modules.
 */
class Invoice {

	private String transactionId;

	public Invoice(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionId() {
		return transactionId;
	}

	@Override
	public String toString() {
		return "Invoice{transactionId='" + transactionId + "'}";
	}
}
