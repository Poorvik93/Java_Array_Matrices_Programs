package com.practices.matrices;

public class DiagonalElement {

	public static void main(String[] args) {
		int[][] matrix = {
	            {4, 5, 6},
	            {8, 9, 7},
	            {10, 8, 7}
	        };
	        
	        System.out.println("Principal Diagonal Elements:");
	        for (int i = 0; i < matrix.length; i++) {
	            System.out.print(matrix[i][i] + " ");
	        }
	}

}
