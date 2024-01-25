package com;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print(" ");
	        int number = scanner.nextInt();
	        scanner.close();
	        int reversedNumber = reverseNumber(number);
	        System.out.println( reversedNumber);
	    }
	    private static int reverseNumber(int num) {
	        int reversedNum = 0;
	        while (num != 0) {
	            int digit = num % 10;
	            reversedNum = reversedNum * 10 + digit;
	            num /= 10;
	        }
	        return reversedNum;
	}

}
