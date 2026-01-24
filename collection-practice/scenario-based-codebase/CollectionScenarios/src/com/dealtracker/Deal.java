package com.dealtracker;

import java.time.LocalDate;

/**
 * Deal 
 * ----- 
 * Represents a discount-based deal in the e-commerce system.
 */
public class Deal implements Promotion<Integer> {

	private String dealCode;
	private LocalDate validTill;
	private int discount;
	private int minimumPurchase;

	public Deal(String dealCode, LocalDate validTill, int discount, int minimumPurchase) {
		this.dealCode = dealCode;
		this.validTill = validTill;
		this.discount = discount;
		this.minimumPurchase = minimumPurchase;
	}

	@Override
	public String getCode() {
		return dealCode;
	}

	@Override
	public Integer getBenefit() {
		return discount;
	}

	public LocalDate getValidTill() {
		return validTill;
	}

	public int getDiscount() {
		return discount;
	}

	@Override
	public String toString() {
		return dealCode + " | Discount: " + discount + "%" + " | MinPurchase: " + minimumPurchase + " | ValidTill: "
				+ validTill;
	}
}
