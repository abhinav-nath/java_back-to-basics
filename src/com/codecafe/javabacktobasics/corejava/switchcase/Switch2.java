package com.codecafe.javabacktobasics.corejava.switchcase;

/**
 * Java 8 : Switch Statement
 * In Java 8 strings & enum were introduced in case values and switch statements started to evolve
 * <p>
 * Example of String switch case:
 */
public class Switch2 {

  public static void main(String[] args) {
    String day = "Tuesday";
    switch (day) {
      case "Monday":
        System.out.println("Week day");
        break;
      case "Tuesday":
        System.out.println("Week day");
        break;
      case "Wednesday":
        System.out.println("Week day");
        break;
      case "Thursday":
        System.out.println("Week day");
        break;
      case "Friday":
        System.out.println("Week day");
        break;
      case "Saturday":
        System.out.println("Weekend");
        break;
      case "Sunday":
        System.out.println("Weekend");
        break;
      default:
        System.out.println("Unknown");
    }
  }

}
