package com.codecafe.javabacktobasics.corejava.switchcase;

/**
 * Java 12 : Switch Statement
 * Java 12 further enhanced the switch statement and introduced switch expressions as a <i>preview</i> feature.
 * <p>
 * It introduced a flurry of new features:
 * <p>
 * - You can return values from a switch block and hence switch statements became <i>switch expressions</i>
 * - You can have multiple values in a case label
 * - You can return value from a switch expression through the arrow operator or through the "break" keyword
 * <p>
 * The word "break" can be used to return the result value.
 * <p>
 * This word was replaced by "yield" later in Java 13.
 */
public class Switch4 {

  public static void main(String[] args) {
    String day = "Wednesday";
    System.out.println(checkDay(day));
  }

  private static String checkDay(String day) {
    return switch (day) {
      case "Monday":
        yield "Weekday";
      case "Tuesday":
        yield "Weekday";
      case "Wednesday":
        yield "Weekday";
      case "Thursday":
        yield "Weekday";
      case "Friday":
        yield "Weekday";
      case "Saturday":
        yield "Weekend";
      case "Sunday":
        yield "Weekend";
      default:
        yield "Unknown";
    };
  }

}
