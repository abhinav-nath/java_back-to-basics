package com.codecafe.commonproblems.numbers;

import java.util.Scanner;

/*
 * Adam number is a number when reversed, the square of the number and the square of the reversed number should be numbers which are reverse of each other.
 * 
 * Enter a range > 10 to find Adam numbers : 
 * 500
 * Adam numbers upto 500 are :
 * 11 12 13 21 22 31 101 102 103 111 112 113 121 122 201 202 211 212 221 301 311 
 */
public class AdamNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range > 10 to find Adam numbers : ");
		int range = sc.nextInt();

		if(range <= 10) {
			System.out.println("Invalid range");
		} else {

			System.out.println("Adam numbers upto "+range+" are :");
			for(int i=11; i<=range; i++) {

				long reverseNumber = reverseNumber(i);
				long squareOfNumber = i*i;
				long squareOfReverseNumber = reverseNumber*reverseNumber;
				
				if(squareOfNumber == reverseNumber(squareOfReverseNumber))
					System.out.print(i+" ");

				sc.close();
			}
		}
	}

	private static long reverseNumber(long number) {

		long rem = 0;
		long reverse = 0;

		while(number != 0) {
			rem = number % 10;
			reverse = (10 * reverse) + rem;
			number = number/10;
		}

		return reverse;
	}

}