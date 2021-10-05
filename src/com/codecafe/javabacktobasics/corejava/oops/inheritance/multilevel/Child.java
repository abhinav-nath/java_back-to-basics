package com.codecafe.javabacktobasics.corejava.oops.inheritance.multilevel;

// Object -> Parent -> Child
// Child also have methods of Object class
public class Child extends Parent {

    public void bar() {
        foo();
        System.out.println("Child::bar");
    }

    public int getHashCode() {
        return hashCode(); // method of Object class
    }

}