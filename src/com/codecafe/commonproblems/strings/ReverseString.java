package com.codecafe.commonproblems.strings;

public class ReverseString {

    public static void main(String[] args) {

        String str = "hello how are you";

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

    }

}