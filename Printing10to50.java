package com;

import java.util.Scanner;

public class Printing10to50 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the starting number: ");
	        int startNumber = scanner.nextInt();
	        System.out.print("Enter the ending number: ");
	        int endNumber = scanner.nextInt();
	        scanner.close();
	        if (startNumber <= endNumber) {
	            for (int i = startNumber; i <= endNumber; i++) {
	                System.out.print(i + " ");
	            }
	        } else {
	            System.out.println("Invalid input. Starting number should be less than or equal to ending number.");
	        }

	}

}
