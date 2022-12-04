package com.codecafe.javabacktobasics.commonproblems.strings;

import java.util.Scanner;

/*
  Enter a String :
  hello world

  New String is : hhheeellllllooo wwwooorrrlllddd
*/

public class DuplicateCharacters {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a String : ");
    String inputString = sc.nextLine();

    char[] charArray = inputString.toCharArray();

    StringBuilder newString = new StringBuilder();
    for (char c : charArray) {
      if (c != ' ') {
        newString.append(String.valueOf(c).repeat(3));
      } else {
        newString.append(' ');
      }
    }

    System.out.println("\nNew String is : " + newString);
    sc.close();
  }

}