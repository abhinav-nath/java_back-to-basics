package com.codecafe.commonproblems.patterns;

import java.util.Scanner;
/*
Enter a number : 6

     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
* * * * * * 

 */

public class Pyramid {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		System.out.println();

		for(int i=1; i<=num; i++) {

			for(int k=num-i; k>=1; k--) {
				System.out.print(" ");
			}

			for(int j=1; j<=i; j++) {
				System.out.print("* ");	
			}

			System.out.println();
		}

		sc.close();
	}
}