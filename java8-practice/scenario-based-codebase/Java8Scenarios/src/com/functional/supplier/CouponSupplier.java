package com.functional.supplier;

import java.util.Random;
import java.util.function.Supplier;

/*
 * CouponSupplier
 * ------------------
 * Uses Supplier to generate random discount coupon codes.
 */
public class CouponSupplier {
	
    public static void main(String[] args) {

        Supplier<String> couponSupplier = () -> {
            int num = 1000 + new Random().nextInt(9000);
            return "SAVE" + num;
        };

        System.out.println(" Coupon for Nishita: " + couponSupplier.get());
        System.out.println(" Coupon for Sarthak: " + couponSupplier.get());
    }

}
