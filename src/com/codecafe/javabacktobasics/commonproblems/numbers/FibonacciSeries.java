package com.codecafe.javabacktobasics.commonproblems.numbers;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms to generate : ");
        int num = sc.nextInt();

        generateFibonacciSeries(num);

        sc.close();
    }


    private static void generateFibonacciSeries(int num) {

        long t1 = 0, t2 = 1;

        System.out.println("\nFirst " + num + " terms :");

        for (int i = 1; i <= num; i++) {

            System.out.print(t1 + " ");

            long sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }

}