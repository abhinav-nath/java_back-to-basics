package com.codecafe.oca_prep;

public class MethodOverloadingPuzzle {

    public static void main(String[] args) {
        doSum(10, 20);
        doSum(10.0, 20.0);
        doSum(10.0f, 20.0f);
    }

    private static void doSum(Integer num1, Integer num2) {
        System.out.println("Integer sum is " + (num1 + num2));
    }

    private static void doSum(double num1, double num2) {
        System.out.println("double sum is " + (num1 + num2));
    }

    private static void doSum(float num1, float num2) {
        System.out.println("float sum is " + (num1 + num2));
    }

    private static void doSum(int num1, int num2) {
        System.out.println("integer sum is " + (num1 + num2));
    }

}