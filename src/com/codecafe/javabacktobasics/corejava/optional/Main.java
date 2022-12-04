package com.codecafe.javabacktobasics.corejava.optional;

import java.util.List;
import java.util.Optional;

public class Main {

  static List<Cat> cats = List.of(new Cat("Fred"), new Cat("Tom"), new Cat("Simba"));

  public static void main(String[] args) {
    String catName = "Garfield";
    Optional<Cat> cat = findCatByName(catName);
    System.out.println(cat.orElseThrow(() -> new RuntimeException(catName + " not found")));
  }

  private static Optional<Cat> findCatByName(String name) {
    return cats.stream()
               .filter(cat -> name.equals(cat.name()))
               .findFirst();
  }

}

record Cat(String name) {
}