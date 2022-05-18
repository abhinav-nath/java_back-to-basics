package com.codecafe.javabacktobasics.commonproblems.patterns;

import java.util.Scanner;
/*

Enter a number : 6

     A
    A B
   A B C
  A B C D
 A B C D E
A B C D E F
 A B C D E
  A B C D
   A B C
    A B
     A

 */

public class AlphabetDiamond {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number : ");
    int num = sc.nextInt();
    System.out.println();

    int alphabet;
    // outer loop to handle number of rows
    for (int i = 1; i <= num; i++) {
      alphabet = 65;
      // inner loop to handle number of spaces
      for (int k = num - i; k >= 1; k--) {
        System.out.print(" ");
      }
      // inner loop to handle number of columns
      for (int j = 1; j <= i; j++) {
        System.out.print((char) alphabet + " ");
        alphabet++;
      }

      System.out.println();
    }

    // outer loop to handle number of rows
    for (int i = 2; i <= num; i++) {
      alphabet = 65;
      // inner loop to handle number of spaces
      for (int k = num - (num - i + 1); k > 0; k--) {
        System.out.print(" ");
      }
      // inner loop to handle number of columns
      for (int j = 1; j <= num - i + 1; j++) {
        System.out.print((char) alphabet + " ");
        alphabet++;
      }

      System.out.println();
    }

    sc.close();
  }

}