package com.codecafe.commonproblems.patterns;

import java.util.Scanner;
/*

Enter a number : 5

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

 */

public class NumberRightTriangle2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		System.out.println();

		int counter = 1;
		// outer loop to handle number of rows
		for(int i=1; i<=num; i++) {
			// inner loop to handle number of columns
			for(int j=1; j<=i; j++) {
				System.out.print(counter+" ");
				counter++;
			}
			System.out.println();
		}

		sc.close();
	}

}