package com.codecafe.javabacktobasics.corejava.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.codecafe.javabacktobasics.corejava.comparable.Laptop;

public class ComparatorDemo {

  public static void main(String[] args) {
    List<Laptop> laptops = new ArrayList<>();

    Laptop lap1 = new Laptop();
    lap1.setModel("Asus ROG");
    lap1.setRam(16);
    lap1.setPrice(150000);
    laptops.add(lap1);

    Laptop lap2 = new Laptop();
    lap2.setModel("Dell Inspiron");
    lap2.setRam(8);
    lap2.setPrice(30000);
    laptops.add(lap2);

    Laptop lap3 = new Laptop();
    lap3.setModel("Apple MacBook Pro");
    lap3.setRam(32);
    lap3.setPrice(250000);
    laptops.add(lap3);

    Comparator<Laptop> comparator = new Comparator<Laptop>() {
      @Override
      public int compare(Laptop lap1, Laptop lap2) {
        if ((lap1).getPrice() > (lap2).getPrice())
          return 1;
        else
          return -1;
      }
    };

    // Lambda

        /*
        Comparator<Laptop> comparator = (lap11, lap21) -> {
            if ((lap11).getPrice() > (lap21).getPrice())
                return 1;
            else
                return -1;
        };
         */

    Collections.sort(laptops, comparator);

    for (Laptop laptop : laptops)
      System.out.println(laptop);
  }

}