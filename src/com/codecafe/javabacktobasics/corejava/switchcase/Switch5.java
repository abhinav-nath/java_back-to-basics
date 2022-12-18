package com.codecafe.javabacktobasics.corejava.switchcase;

/**
 * Java 12 : Switch Statement
 * Further instead of returning values using break keyword, Java 12 introduced arrow operators as a simple alternative:
 */
public class Switch5 {

  public static void main(String[] args) {
    String day = "Saturday";
    System.out.println(checkDay(day));
  }

  private static String checkDay(String day) {
    return switch (day) {
      case "Monday" -> "Weekday";
      case "Tuesday" -> "Weekday";
      case "Wednesday" -> "Weekday";
      case "Thursday" -> "Weekday";
      case "Friday" -> "Weekday";
      case "Saturday" -> "Weekend";
      case "Sunday" -> "Weekend";
      default -> "Unknown";
    };
  }

}
