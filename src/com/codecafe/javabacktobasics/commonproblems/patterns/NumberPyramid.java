package com.codecafe.javabacktobasics.commonproblems.patterns;

import java.util.Scanner;
/*
Enter a number : 5

    1
   2 3
  3 4 5
 4 5 6 7
5 6 7 8 9

*/

public class NumberPyramid {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number : ");
    int num = sc.nextInt();
    System.out.println();

    int counter;
    // outer loop to handle number of rows
    for (int i = 1; i <= num; i++) {
      counter = i;
      // inner loop to handle number of spaces
      for (int k = num - i; k >= 1; k--) {
        System.out.print(" ");
      }
      // inner loop to handle number of columns
      for (int j = 1; j <= i; j++) {
        System.out.print(counter + " ");
        counter++;
      }

      System.out.println();
    }

    sc.close();
  }

}