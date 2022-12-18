package com.codecafe.javabacktobasics.corejava.switchcase;

/**
 * Java 12 : Switch Statement
 * <b>Multiple case labels</b>
 * Also starting Java 12 multiple case values could be provided in a single case statement:
 */
public class Switch6 {

  public static void main(String[] args) {
    String day = "Saturday";
    System.out.println(checkDay(day));
  }

  private static String checkDay(String day) {
    return switch (day) {
      case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Week day";
      case "Saturday", "Sunday" -> "Weekend";
      default -> "Unknown";
    };
  }

}
