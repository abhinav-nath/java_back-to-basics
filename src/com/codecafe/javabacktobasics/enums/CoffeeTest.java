package com.codecafe.javabacktobasics.enums;

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
    private CupSize cupSize;

    public Coffee(CupSize cupSize) {
        this.cupSize = cupSize;
    }

    public CupSize getCupSize() {
        return cupSize;
    }

    public void setCupSize(CupSize cupSize) {
        this.cupSize = cupSize;
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
        System.out.println("Volume is " + cup);

        Coffee smallCoffee = new Coffee(CupSize.SMALL);
        System.out.println("Volume is " + smallCoffee.getCupSize().getVolume());
        System.out.println("Details : " + smallCoffee.getCupSize().getDetails());

        Coffee mediumCoffee = new Coffee(CupSize.MEDIUM);
        System.out.println("Volume is " + mediumCoffee.getCupSize().getVolume());
        System.out.println("Details : " + mediumCoffee.getCupSize().getDetails());
    }

}