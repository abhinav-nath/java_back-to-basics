package com.codecafe.javabacktobasics.corejava.strings;

public class ImmutableStrings {

  public static void main(String[] args) {
    // Places the String literal "John" in the String pool
    String name = "John";
    String anotherName = "John";
    // Both name and anotherName would be pointing to the same String literal
    System.out.println(name.hashCode() + "\n" + anotherName.hashCode());
    System.out.println("name == anotherName : " + (name == anotherName));

    // will create a brand new object outside of String Pool
    String aThirdName = new String("John");
    System.out.println("name == aThirdName : " + (name == aThirdName));
  }

}
