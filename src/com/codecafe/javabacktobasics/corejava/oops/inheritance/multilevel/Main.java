package com.codecafe.javabacktobasics.corejava.oops.inheritance.multilevel;

public class Main {

  public static void main(String[] args) {
    Child c = new Child();
    c.bar();

    System.out.println("hash code of Child class object : " + c.getHashCode());
  }

}