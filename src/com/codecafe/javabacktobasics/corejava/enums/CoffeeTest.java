package com.codecafe.javabacktobasics.corejava.enums;

enum CupSize {

  SMALL(25) {
    public String getDetails() {
      return "Use the clear glass cup";
    }
  },
  MEDIUM(40),
  LARGE(110);

  private int volume;

  CupSize(int volume) {
    this.volume = volume;
  }

  public int getVolume() {
    return volume;
  }

  public String getDetails() {
    return "Use the blue cup";
  }

}

class Coffee {

  private final CupSize cupSize;

  public Coffee(CupSize cupSize) {
    this.cupSize = cupSize;
  }

  public CupSize getCupSize() {
    return cupSize;
  }

  @Override
  public String toString() {
    return "Coffee{" +
      "cupSize=" + cupSize +
      '}';
  }

}

public class CoffeeTest {

  public static void main(String[] args) {
    CupSize cup = CupSize.MEDIUM;
    System.out.println("Cup Size : " + cup + ", Volume : " + cup.getVolume());

    Coffee smallCoffee = new Coffee(CupSize.SMALL);
    System.out.println("\nCup size :" + smallCoffee.getCupSize());
    System.out.println("Volume : " + smallCoffee.getCupSize().getVolume());
    System.out.println("Details : " + smallCoffee.getCupSize().getDetails());

    System.out.println();

    Coffee mediumCoffee = new Coffee(CupSize.MEDIUM);
    System.out.println("Cup size :" + mediumCoffee.getCupSize());
    System.out.println("Volume : " + mediumCoffee.getCupSize().getVolume());
    System.out.println("Details : " + mediumCoffee.getCupSize().getDetails());
  }

}