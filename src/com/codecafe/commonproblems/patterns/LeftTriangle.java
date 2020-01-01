package com.codecafe.commonproblems.patterns;

import java.util.Scanner;
/*
Enter a number : 6

     *
    **
   ***
  ****
 *****
******

*/

public class LeftTriangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		System.out.println();
		
		// outer loop to handle number of rows
		for(int i=1; i<=num; i++) {
			// inner loop to handle number of spaces
			for(int k=num-i; k>=1; k--) {
				System.out.print(" ");
			}
			// inner loop to handle number of columns
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}