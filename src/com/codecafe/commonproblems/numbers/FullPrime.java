package com.codecafe.commonproblems.numbers;

import java.util.Scanner;

/*

Enter a number : 73
73 is a Full Prime Number

Enter a number : 47
47 is not a Full Prime Number

 */

public class FullPrime {

	// function to check digits
	public static boolean checkDigits(int n) {
		// check all digits are prime or not 
		while (n > 0) {
			int dig = n % 10; 

			// check if digits are prime or not 
			if (dig != 2 && dig != 3 && dig != 5 && dig != 7) 
				return false;

			n /= 10;
		}

		return true;
	}

	// To check if n is prime or not 
	public static boolean isPrime(int n) {
		if (n == 1)
			return false;

		// check for all factors
		for (int i=2; i <= n/2; i++) {
			if (n % i == 0)
				return false;
		}

		return true;
	}

	// To check if n is Full Prime
	public static boolean isFullPrime(int n) {
		// The order is important here for efficiency
		return (checkDigits(n) && isPrime(n));
	}

	// driver code
	public static void main(String[] args) { 

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int inputNumber = sc.nextInt();
		
		if (isFullPrime(inputNumber))
			System.out.print(inputNumber + " is a Full Prime Number");
		else
			System.out.print(inputNumber + " is not a Full Prime Number");
		
		sc.close();
	}

}