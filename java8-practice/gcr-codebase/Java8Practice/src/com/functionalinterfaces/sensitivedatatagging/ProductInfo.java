package com.functionalinterfaces.sensitivedatatagging;

/*
 * ProductInfo
 * -----------
 * Contains public data
 * and does NOT require encryption.
 */
public class ProductInfo {

	private String productName;

	public ProductInfo(String productName) {
		this.productName = productName;
	}
}
