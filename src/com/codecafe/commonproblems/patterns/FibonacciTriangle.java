package com.codecafe.commonproblems.patterns;

import java.util.Scanner;

/*

Enter a number between 1 to 10 : 6

Fibonacci Triangle :
0 
1 1 
2 3 5 
8 13 21 34 
55 89 144 233 377 
610 987 1597 2584 4181 6765 

 */

public class FibonacciTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 10 : ");
        int num = sc.nextInt();

        if (num >= 1 && num <= 10)
            generateFibonacciTriangle(num);
        else
            System.out.println("Input number must be between 1 to 10");

        sc.close();
    }


    private static void generateFibonacciTriangle(int num) {

        long t1 = 0, t2 = 1;

        System.out.println("\nFibonacci Triangle :");

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(t1 + " ");
                long sum = t1 + t2;
                t1 = t2;
                t2 = sum;
            }

            System.out.println();
        }
    }

}
