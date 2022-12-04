package com.codecafe.javabacktobasics.corejava.records;

public record Employee(int employeeNumber, String name) {

  // can have static variables
  public static final Integer DEFAULT_EMPLOYEE_NUMBER = 1000;

  // Compact Constructor
  public Employee {
    if (employeeNumber < 0) {
      throw new IllegalArgumentException("employeeNumber cannot be negative");
    }
  }

  // can have methods
  public String nameInUpperCase() {
    return name.toUpperCase();
  }

  // can have static methods
  public static void printWhatever() {
    System.out.println("Whatever");
  }

}
