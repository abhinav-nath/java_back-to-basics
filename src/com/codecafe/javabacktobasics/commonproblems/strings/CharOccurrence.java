package com.codecafe.javabacktobasics.commonproblems.strings;

import java.util.HashMap;
import java.util.Map;

public class CharOccurrence {

  public static void main(String[] args) {
    String str = "helloworld";

    countUsingArray(str);

    // countUsingHashMap(str);
  }

  private static void countUsingArray(String str) {
    int count[] = new int[256];

    int len = str.length();

    // Initialize count array index
    for (int i = 0; i < len; i++)
      count[str.charAt(i)]++;

    // Create an array of given String size
    char ch[] = new char[str.length()];

    for (int i = 0; i < len; i++) {

      ch[i] = str.charAt(i);

      int found = 0;

      for (int j = 0; j <= i; j++) {
        if (str.charAt(i) == str.charAt(j))
          found++;
      }

      if (found == 1)
        System.out.println(str.charAt(i) + " - " + count[str.charAt(i)]);
    }
  }

  private static void countUsingHashMap(String str) {
    Map<Character, Integer> charMap = new HashMap<>();

    for (char c : str.toCharArray()) {
      if (charMap.get(c) != null)
        charMap.put(c, charMap.get(c) + 1);
      else
        charMap.put(c, 1);
    }

    for (char c : str.toCharArray()) {
      System.out.println(c + " - " + charMap.get(c));
    }
  }

}