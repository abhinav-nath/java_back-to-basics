package com.codecafe.javabacktobasics.corejava.datatypes.strings;

public class StringInterningDemo {

  public static void main(String[] args) {
    String s1 = "shazam";
    String s2 = "shazam";
    String s3 = "shazam!";

    System.out.println("s1 hashCode : " + s1.hashCode());
    System.out.println("s2 hashCode : " + s2.hashCode());
    System.out.println("s3 hashCode : " + s3.hashCode());

    String s4 = "chicken"; // goes to SCP
    String s5 = new String("chicken"); // goes to heap

    // Comparing memory locations
    System.out.println(s4 == s5); // false

    // Comparing only values
    System.out.println(s4.equals(s5)); // true


    String s6 = new String("pizza"); // goes to heap
    String s7 = s6.intern(); // goes to SCP

    System.out.println(s6 == s7); // false
    System.out.println(s6.equals(s7)); // true


    String s8 = s4.concat(" " + s6); // goes to heap !!

    String s9 = "chicken pizza"; // goes to SCP

    System.out.println(s8 == s9); // false
    System.out.println(s8.equals(s9)); // true


    String s10 = s8.intern(); // brings s8 to SCP

    System.out.println(s9 == s10); // true
    System.out.println(s9.equals(s10)); // true
  }

}