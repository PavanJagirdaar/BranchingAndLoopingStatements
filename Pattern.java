package com;

public class Pattern {

	public static void main(String[] args) {
		int rows = 5;
        int columns = 5;
       for (int i = 0; i < rows; i++) {
       for (int j = 0; j < columns; j++) {              
       System.out.print((5 - Math.min(i, j)) + " ");
            }
           
       System.out.println();
        }
	}

}
