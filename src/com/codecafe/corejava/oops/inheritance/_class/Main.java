package com.codecafe.corejava.oops.inheritance._class;

public class Main {

    public static void main(String[] args) {

        Parent parent = new Child();

        parent.foo();
        // parent.bar(); compilation error : The method bar() is undefined for the type Parent

        ((Child) parent).bar();

        Child child = new Child();

        child.foo();
        child.bar();

    }

}