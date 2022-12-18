package com.codecafe.javabacktobasics.corejava.switchcase;

/**
 * Java 7 : Switch Statement
 * Until Java 7 only integers could be used in switch case and this had been the standard for a long time
 */
public class Switch1 {

  public static void main(String[] args) {
    int value = 5;
    switch (value) {
      case 1:
        System.out.println("One");
        break;
      case 5:
        System.out.println("five");
        break;
      default:
        System.out.println("Unknown");
    }
  }

}
