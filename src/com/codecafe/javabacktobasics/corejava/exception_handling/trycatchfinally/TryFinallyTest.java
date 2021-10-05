package com.codecafe.javabacktobasics.corejava.exception_handling.trycatchfinally;

// if try block throws an exception
// and there is a finally block which
// also throws an exception then
// only finally block's exception will be thrown

// finally acts like a catch block in this case

public class TryFinallyTest {

    public static void main(String[] args) {

        try {
            int x = 2 / 0;
        } finally {
            // if line 13 throws or does not throw an exception,
            // this code will always be executed
            int x = 5 / 0;
        }
    }

}


/*

Exception in thread "main" java.lang.ArithmeticException: / by zero
    at com.codecafe.javabacktobasics.corejava.exception_handling.trycatchfinally.TryFinallyTest.main(TryFinallyTest.java:19)

*/