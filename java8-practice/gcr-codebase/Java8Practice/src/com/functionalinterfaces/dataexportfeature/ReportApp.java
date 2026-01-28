package com.functionalinterfaces.dataexportfeature;

/*
 * ReportApp
 * ---------
 * Demonstrates backward-compatible
 * JSON export functionality.
 */
public class ReportApp {

	public static void main(String[] args) {

		DataExporter salesReport = new SalesReportExporter();
		DataExporter inventoryReport = new InventoryReportExporter();

		salesReport.exportToCSV();
		salesReport.exportToPDF();
		salesReport.exportToJSON(); // default method

		System.out.println("--------------------");

		inventoryReport.exportToCSV();
		inventoryReport.exportToPDF();
		inventoryReport.exportToJSON(); // overridden method
	}
}
