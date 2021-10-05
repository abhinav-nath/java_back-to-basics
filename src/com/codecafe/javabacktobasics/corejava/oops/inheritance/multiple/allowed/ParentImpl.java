package com.codecafe.javabacktobasics.corejava.oops.inheritance.multiple.allowed;

// multiple inheritance is supported in Java
// using Interfaces

// Impl class can implement multiple Interfaces
public class ParentImpl implements IParent1, IParent2 {

    @Override
    public void foo() {
        System.out.println("ParentImpl foo");
    }

}