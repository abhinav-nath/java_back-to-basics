package com.codecafe.commonproblems.numbers;

import java.util.Scanner;

/*
Enter a number : 10

Factorial of 10 using Iteration = 3628800, execution time : 10500
Factorial of 10 using Recursion = 3628800, execution time : 8600
Factorial of 10 using Tail Recursion = 3628800, execution time : 8700
*/
public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int number = sc.nextInt();

		long startTime = System.nanoTime();
		long factUsingIteration = factorialUsingIteration(number);
		long executionTime = System.nanoTime() - startTime;
		System.out.printf("\nFactorial of %d using Iteration = %d, execution time : %d", number, factUsingIteration, executionTime);

		startTime = System.nanoTime();
		long factUsingRecursion = factorialUsingTraditionalRecursion(number);
		executionTime = System.nanoTime() - startTime;
		System.out.printf("\nFactorial of %d using Recursion = %d, execution time : %d", number, factUsingRecursion, executionTime);
		
		startTime = System.nanoTime();
		long factUsingTailRecursion = factorialUsingTailRecursion(number, 1);
		executionTime = System.nanoTime() - startTime;
		System.out.printf("\nFactorial of %d using Tail Recursion = %d, execution time : %d", number, factUsingTailRecursion, executionTime);

		sc.close();
	}


	private static long factorialUsingIteration(int number) {

		long fact = 1;
		while(number > 0) {
			fact = fact * number;
			number--;
		}

		return fact;
	}


	private static long factorialUsingTraditionalRecursion(int number) {

		if(number == 0) {
			return 1;
		}

		return number * factorialUsingTraditionalRecursion(number-1);
	}
	
	
	private static long factorialUsingTailRecursion(int number, long fact) {
		
		if(number == 0) {
			return fact;
		}
		
		return factorialUsingTailRecursion(number-1, fact*number);
	}

}