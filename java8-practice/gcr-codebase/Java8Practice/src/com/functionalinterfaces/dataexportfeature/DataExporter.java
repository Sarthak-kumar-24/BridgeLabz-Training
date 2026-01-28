package com.functionalinterfaces.dataexportfeature;

/*
 * DataExporter Interface
 * ----------------------
 * Defines export operations
 * for reporting modules.
 */
public interface DataExporter {

	/**
	 * Export report data to CSV format.
	 */
	void exportToCSV();

	/**
	 * Export report data to PDF format.
	 */
	void exportToPDF();

	/**
	 * Default JSON export implementation. Existing exporters are not required to
	 * implement this method.
	 */
	default void exportToJSON() {
		System.out.println(" Exporting report data to JSON (default implementation)");
	}
}
