package com.codecafe.commonproblems.numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*

Enter a number : 251
It's permutations are : 


125 
125 is not a Prime number

It is divisible by : 
[5, 25]

512 
512 is not a Prime number

It is divisible by : 
[2, 4, 8, 16, 32, 64, 128, 256]

251 is not a Circular Prime number

 */

public class CircularPrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int inputNumber = sc.nextInt();

        if (isPrime(inputNumber)) {

            checkCircularPrime(inputNumber);
        } else {
            System.out.println(inputNumber + " is not a Prime number");

            System.out.println("\nIt is divisible by : ");
            List<Integer> factors = findFactors(inputNumber);
            System.out.print(factors);
        }

        sc.close();
    }


    private static void checkCircularPrime(int inputNumber) {

        boolean isCircularPrime = true;

        // Count digits.
        int numberOfDigits = 0, temp = inputNumber;
        while (temp > 0) {
            numberOfDigits++;
            temp /= 10;
        }

        int num = circulateNumber(inputNumber, numberOfDigits);

        // If all the permutations are checked and
        // we obtain original number exit from loop.
        System.out.println("It's permutations are : ");
        while (num != inputNumber) {
            System.out.print("\n\n" + num + " \n");
            if (!isPrime(num)) {
                isCircularPrime = false;
                System.out.println(num + " is not a Prime number\n");

                System.out.println("It is divisible by : ");
                List<Integer> factors = findFactors(num);
                System.out.print(factors);
            }
            num = circulateNumber(num, numberOfDigits);
        }
        if (isCircularPrime)
            System.out.println("\n\n" + inputNumber + " is a Circular Prime number");
        else
            System.out.println("\n\n" + inputNumber + " is not a Circular Prime number");
    }


    private static int circulateNumber(int num, int numberOfDigits) {
        // Following three lines generate the next circular permutation of a number
        // We move the last digit to the first position
        int rem = num % 10;
        int div = num / 10;
        num = (int) ((Math.pow(10, numberOfDigits - 1)) * rem) + div;

        return num;
    }


    private static boolean isPrime(int inputNumber) {

        if (inputNumber == 1)
            return true;

        for (int i = 2; i <= inputNumber / 2; i++) {
            if (inputNumber % i == 0)
                return false;
        }

        return true;
    }


    private static List<Integer> findFactors(int inputNumber) {

        List<Integer> listOfFactors = new ArrayList<>();

        for (int i = 2; i <= inputNumber / 2; i++) {
            if (inputNumber % i == 0)
                listOfFactors.add(i);
        }

        return listOfFactors;
    }

}