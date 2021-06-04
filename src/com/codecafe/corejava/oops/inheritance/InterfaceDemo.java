package com.codecafe.corejava.oops.inheritance;

public class InterfaceDemo {

    public static void main(String[] args) {

        IParent parent = new Child();

        parent.foo();

        // parent.bar(); compilation error

        ((Child) parent).bar();

    }

}