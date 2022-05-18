package com.codecafe.javabacktobasics.corejava.oops.inheritance._interface;

public class Child implements IParent {

  @Override
  public void foo() {
    System.out.println("Child :: foo");
  }

  public void bar() {
    System.out.println("Child :: bar");
  }

}