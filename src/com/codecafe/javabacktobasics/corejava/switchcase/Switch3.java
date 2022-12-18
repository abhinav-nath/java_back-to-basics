package com.codecafe.javabacktobasics.corejava.switchcase;

/**
 * Java 8 : Switch Statement
 * In Java 8 strings & enum were introduced in case values and switch statements started to evolve
 * <p>
 * Example of Enum switch case:
 */
public class Switch3 {

  enum DAYS {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
  }

  public static void main(String[] args) {
    DAYS days = DAYS.SUNDAY;
    switch (days) {
      case MONDAY:
        System.out.println("Weekday");
        break;
      case TUESDAY:
        System.out.println("Weekday");
        break;
      case WEDNESDAY:
        System.out.println("Weekday");
        break;
      case THURSDAY:
        System.out.println("Weekday");
        break;
      case FRIDAY:
        System.out.println("Weekday");
        break;
      case SATURDAY:
        System.out.println("Weekend");
        break;
      case SUNDAY:
        System.out.println("Weekend");
        break;
      default:
        System.out.println("Unknown");
    }
  }

}
