package com.codecafe.corejava.oops.inheritance;

public class Child implements IParent {

    @Override
    public void foo() {
        System.out.println("foo");
    }

    public void bar() {
        System.out.println("bar");
    }

}