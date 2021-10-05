package com.codecafe.miscellaneous;

class Customer {

    String name;

    public Customer(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + "]";
    }

}

public class MythOfFinalObjects {

    public static void main(String[] args) {

        final Customer c = new Customer("John");

        System.out.println("before : " + c);

        // c = new Customer("Abhinav");
        // The final local variable c cannot be assigned. It must be blank and not using a compound assignment

        // BUT

        c.setName("Abhinav"); // valid

        System.out.println("after : " + c);
    }

}
