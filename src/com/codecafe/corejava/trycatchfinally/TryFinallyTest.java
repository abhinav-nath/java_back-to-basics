package com.codecafe.corejava.trycatchfinally;

// if try block throws an exception
// and there is a finally block which
// also throws an exception then
// only finally block's exception will be thrown

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
at com.codecafe.corejava.trycatchfinally.TryFinallyTest.main(TryFinallyTest.java:17)

*/