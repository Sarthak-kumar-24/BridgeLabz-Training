package com.functionalinterfaces.dataexportfeature;

/*
 * InventoryReportExporter
 * -----------------------
 * Report exporter with custom JSON support.
 */
public class InventoryReportExporter implements DataExporter {

	@Override
	public void exportToCSV() {
		System.out.println(" Inventory report exported to CSV");
	}

	@Override
	public void exportToPDF() {
		System.out.println(" Inventory report exported to PDF");
	}

	@Override
	public void exportToJSON() {
		System.out.println(" Inventory report exported to JSON (custom implementation)");
	}
}
