package com.codecafe.javabacktobasics.commonproblems.numbers;

import java.util.Scanner;

/*
 * Reverse and add a number until you get a Palindrome

	7325 (Input Number) + 5237 (Reverse Of Input Number) = 12562
	12562 + 26521 = 39083
	39083 + 38093 = 77176
	77176 + 67177 = 144353
	144353 + 353441 = 497794 (Palindrome)

 */

public class ReverseAddPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        long number = sc.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is already a Palindrome number");
        } else {
            while (!isPalindrome(number)) {
                long reverse = reverseNumber(number);
                long sum = number + reverse;
                System.out.println(number + " + " + reverse + " = " + sum);
                number = sum;
            }
        }

        sc.close();
    }

    private static boolean isPalindrome(long input) {
        if (reverseNumber(input) == input)
            return true;
        else
            return false;
    }

    private static long reverseNumber(long number) {

        long reverse = 0;
        long rem = 0;

        while (number != 0) {
            rem = number % 10;
            reverse = (reverse * 10) + rem;
            number = number / 10;
        }

        return reverse;
    }

}