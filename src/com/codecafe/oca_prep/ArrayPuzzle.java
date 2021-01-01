package com.codecafe.oca_prep;

public class ArrayPuzzle {

    public static void main(String[] args) {
        int numbers[];

        numbers = new int[2];

        numbers[0] = 10;
        numbers[1] = 20;

        numbers = new int[4];

        numbers[2] = 30;
        numbers[3] = 40;

        for (int n : numbers)
            System.out.print(" " + n);

    }

}