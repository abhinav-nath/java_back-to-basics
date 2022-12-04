package com.codecafe.javabacktobasics.corejava.exception_handling.custom_exceptions;

public class Main {

  public static void main(String[] args) {
    validateAge(-3);
  }

  private static void validateAge(int age) {
    if (age < 0) {
      throw new AgeLessThanZeroException("Age cannot be negative", new RuntimeException());
    }
  }

}
