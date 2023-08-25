package com.practices.matrices;

public class SumOfPrimeNuminMatrices {

	    // Function to check whether a number is prime
	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        int[][] matrix = {
	                {4, 5, 6},
	                {8, 9, 7},
	                {10, 8, 7}
	        };

	        int sumOfPrimes = 0;

	        // Loop through the matrix elements
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[i].length; j++) {
	                // Check if the element is prime
	                if (isPrime(matrix[i][j])) {
	                    sumOfPrimes += matrix[i][j]; // Add prime element to the sum
	                }
	            }
	        }
	        System.out.println("Sum of prime numbers in the matrix: " + sumOfPrimes);

	        int squareOfSum = sumOfPrimes * sumOfPrimes; // Calculate the square of sum
	        System.out.println("Square of the sum of prime numbers in the matrix: " + squareOfSum);
	    }
	}
