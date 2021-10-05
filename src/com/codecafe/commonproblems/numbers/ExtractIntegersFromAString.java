package com.codecafe.commonproblems.numbers;

// Replace all the non-digit characters with spaces (" ")
// Replace every consecutive group of spaces with a single space
// Eliminate the leading and the trailing spaces (if any) and the final string will only contain the required integers

/*
   Output :
   1122 4 543
   23 2 5 3 3 3 5 2 567 422
 */
public class ExtractIntegersFromAString {

    public static void main(String[] args) {

        String str = "avbkjd1122klj4 543 af";
        System.out.println(extractInt(str));

        str = "wa23kjn2kjn5jn3 3j3j lk5ll2 567   422    ";
        System.out.println(extractInt(str));

    }


    private static String extractInt(String str) {

        // Replacing every non-digit number with a space(" ")
        str = str.replaceAll("[^\\d]", " ");

        // Remove extra spaces from the beginning and ending of the string
        str = str.trim();

        // Replace all the consecutive white spaces with a single space
        str = str.replaceAll(" +", " ");

        if (str.equals(""))
            return "-1";

        return str;

    }

}