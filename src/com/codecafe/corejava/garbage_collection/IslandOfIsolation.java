package com.codecafe.corejava.garbage_collection;

class Test {
    Test i;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() called");
    }
}

public class IslandOfIsolation {

    public static void main(String[] args) {

        Test t1 = new Test();
        Test t2 = new Test();

        // Object of t1 gets a copy of t2
        t1.i = t2;

        // Object of t2 gets a copy of t1
        t2.i = t1;

        // Till now no object eligible
        // for garbage collection
        t1 = null;

        // now two objects are eligible for
        // garbage collection
        t2 = null;

        // calling garbage collector
        System.gc();
    }

}