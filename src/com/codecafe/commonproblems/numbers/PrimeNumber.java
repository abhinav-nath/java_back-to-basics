package com.codecafe.commonproblems.numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*

Enter a number : 189
189 is not a Prime number

It is divisible by : 
[3, 7, 9, 21, 27, 63]


Enter a number : 53
53 is a Prime number

 */

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int inputNumber = sc.nextInt();

		if(isPrime(inputNumber))
			System.out.println(inputNumber + " is a Prime number");
		else {
			System.out.println(inputNumber + " is not a Prime number");
			
			System.out.println("\nIt is divisible by : ");
			List<Integer> factors = findFactors(inputNumber);
			System.out.print(factors);
		}

		sc.close();
	}


	private static boolean isPrime(int inputNumber) {

		if(inputNumber == 1)
			return true;

		for(int i=2; i<=inputNumber/2; i++) {
			if(inputNumber % i == 0)
				return false;
		}

		return true;
	}


	private static List<Integer> findFactors(int inputNumber) {
		
		List<Integer> listOfFactors = new ArrayList<>();
		
		for(int i=2; i<=inputNumber/2; i++) {
			if(inputNumber % i == 0)
				listOfFactors.add(i);
		}
		
		return listOfFactors;
	}
}