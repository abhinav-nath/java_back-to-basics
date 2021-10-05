package com.codecafe.javabacktobasics.corejava.comparable;

public class Laptop implements Comparable<Laptop> {

    private String model;
    private int ram;
    private double price;

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public double getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // default sorting based on ram
    @Override
    public int compareTo(Laptop obj) {
        if (this.ram > obj.getRam())
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "Laptop [model=" + model + ", ram=" + ram + ", price=" + price + "]";
    }

}