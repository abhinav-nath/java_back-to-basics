package com.codecafe.javabacktobasics.corejava.exception_handling.trycatchfinally;

// finally gets executed even when
// there is a return statement
// in try or catch block

// finally gets executed before the return statement

public class TryCatchFinallyTest {

  public static void main(String[] args) {
    someMethod();
  }

  public static void someMethod() {
    String s = null;
    try {
      System.out.println("try block");
      System.out.println(s.length());
    } catch (NullPointerException npe) {
      System.out.println("catch block");
      return;
    } finally {
      System.out.println("finally block");
    }
  }

}