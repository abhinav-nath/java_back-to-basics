package com.codecafe.javabacktobasics.corejava.immutability;

public class ImmutableClassDemo {

  public static void main(String[] args) {
    DateOfBirth dob = new DateOfBirth();

    dob.setDay(26);
    dob.setMonth(8);
    dob.setYear(1990);

    ImmutableStudent is = new ImmutableStudent(1001, "John", dob);

    System.out.println("Before\nImmutableStudent = " + is.getId() + " " + is.getName() + " " + is.getDob());

    dob.setDay(27);
    dob.setDay(3);
    dob.setYear(1991);

    System.out.println("\nAfter Scenario 1:\nImmutableStudent = " + is.getId() + " " + is.getName() + " " + is.getDob());

    is.getDob().setYear(1993);

    System.out.println("\nAfter Scenario 2:\nImmutableStudent = " + is.getId() + " " + is.getName() + " " + is.getDob());
  }

}

/*
Output:

Before
ImmutableStudent = 1001 John [day=26 month=8 year=1990]

After Scenario 1:
ImmutableStudent = 1001 John [day=26 month=8 year=1990]

After Scenario 2:
ImmutableStudent = 1001 John [day=26 month=8 year=1990]
 */