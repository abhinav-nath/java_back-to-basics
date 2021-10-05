package com.codecafe.corejava.exception_handling.trycatchfinally;

/*
  The code in a finally block takes precedence over the return statement.
  
  Output :
  
  Try block
  Finally block
  1
  
 */
public class FinallyRunsBeforeReturn {

    public static void main(String[] args) {

        System.out.println(proveIt());
    }

    private static int proveIt() {

        try {
            System.out.println("Try block");
            return 1;
        } finally {
            System.out.println("Finally block");
        }
    }

}