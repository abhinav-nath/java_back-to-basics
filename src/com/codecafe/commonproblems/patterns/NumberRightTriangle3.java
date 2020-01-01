package com.codecafe.commonproblems.patterns;

import java.util.Scanner;
/*

Enter a number : 6

1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
6 6 6 6 6 6 

*/

public class NumberRightTriangle3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		System.out.println();

		// outer loop to handle number of rows
		for(int i=1; i<=num; i++) {
			// inner loop to handle number of columns
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

		sc.close();
	}

}