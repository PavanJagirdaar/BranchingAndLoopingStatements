package com;

import java.util.Scanner;

public class NegativeOrPositive {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print(" ");
        int number = scanner.nextInt();
        scanner.close();
        if (number > 0) {
            System.out.println("The entered number is positive.");
        } else if (number < 0) {
            System.out.println("The entered number is negative.");
        } else {
            System.out.println("The entered number is zero.");
        }
	}

}
