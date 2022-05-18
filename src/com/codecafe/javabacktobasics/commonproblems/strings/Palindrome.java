package com.codecafe.javabacktobasics.commonproblems.strings;

import java.util.Scanner;

/*
Enter a String :
madam
Is madam a palindrome? : true
*/
public class Palindrome {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a String :");
    String input = sc.nextLine();

    System.out.printf("Is %s a palindrome? : %b", input, isPalindrome(input));

    sc.close();
  }

  private static boolean isPalindrome(String input) {
    if (input == null || input.isEmpty()) {
      return true;
    }

    char[] array = input.toCharArray();

    StringBuilder sb = new StringBuilder(input.length());

    // Reverse the String
    for (int i = input.length() - 1; i >= 0; i--) {
      sb.append(array[i]);
    }

    // Compare input String with Reversed String
    return input.equals(sb.toString());
  }

}