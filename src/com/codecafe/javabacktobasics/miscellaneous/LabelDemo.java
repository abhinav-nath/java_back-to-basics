package com.codecafe.javabacktobasics.miscellaneous;

public class LabelDemo {

  public static void main(String[] args) {
    // label for outer loop
    outer:
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (j == 2)
          break outer;
        System.out.println("value of j = " + j);
      }
    }
  }

}