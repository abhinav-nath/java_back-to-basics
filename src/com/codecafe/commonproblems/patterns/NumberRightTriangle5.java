package com.codecafe.commonproblems.patterns;

import java.util.Scanner;
/*

Enter a number : 6

1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1 
6 5 4 3 2 1 

*/

public class NumberRightTriangle5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println();

        int counter;
        // outer loop to handle number of rows
        for (int i = 1; i <= num; i++) {
            counter = num - (num - i);
            // inner loop to handle number of columns
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter--;
            }
            System.out.println();
        }

        sc.close();
    }

}