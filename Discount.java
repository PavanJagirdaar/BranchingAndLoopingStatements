package com;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the purchase amount: ");
	        double purchaseAmount = scanner.nextDouble();
	        scanner.close();
	        double discount = calculateDiscount(purchaseAmount);
	        double finalAmount = purchaseAmount - discount;
	        System.out.println("Purchase Amount: $" + purchaseAmount);
	        System.out.println("Discount: $" + discount);
	        System.out.println("Final Payable Amount: $" + finalAmount);
	    }
	    private static double calculateDiscount(double amount) {
	        if (amount < 500) {
	            return 0.0;
	        } else if (amount <= 1000) {
	            return (amount * 10.0) / 100.0;
	        } else {
	            return (amount * 20.0) / 100.0;
	        }
	}

}
