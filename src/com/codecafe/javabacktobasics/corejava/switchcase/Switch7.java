package com.codecafe.javabacktobasics.corejava.switchcase;

/**
 * Java 14 : Switch Statement Changes
 * Java 14 made all the switch statement features permanent from being a preview feature (from Java 12 and 13)
 * The flag –enable-preview need not be set starting java 14 and switch statements have evolved into switch expressions!
 */
public class Switch7 {

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
