package com.codecafe.javabacktobasics.corejava.records;

public class Main {

  public static void main(String[] args) {
    Employee employee = new Employee(1001, "John Doe");
    System.out.println("employeeNumber: " + employee.employeeNumber() + "\nname : " + employee.name());
    System.out.println(employee.nameInUpperCase());
    Employee.printWhatever();
    System.out.println(employee);
  }

}