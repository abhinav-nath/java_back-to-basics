package com.codecafe.javabacktobasics.miscellaneous;

class Customer {

  String name;

  public Customer(String name) {
    super();
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Customer [name=" + name + "]";
  }

}

public class MythOfFinalObjects {

  public static void main(String[] args) {
    final Customer c = new Customer("John");

    System.out.println("before : " + c);

    // c = new Customer("Tim");
    // The final local variable c cannot be assigned. It must be blank and not using a compound assignment

    // BUT

    c.setName("Tim"); // valid

    System.out.println("after  : " + c);
  }

}

/*
Output:

before : Customer [name=John]
after  : Customer [name=Tim]
 */