package com.functionalinterfaces.dataexportfeature;

/**
 * SalesReportExporter ------------------- Existing report exporter.
 */
public class SalesReportExporter implements DataExporter {

	@Override
	public void exportToCSV() {
		System.out.println(" Sales report exported to CSV");
	}

	@Override
	public void exportToPDF() {
		System.out.println(" Sales report exported to PDF");
	}
}
