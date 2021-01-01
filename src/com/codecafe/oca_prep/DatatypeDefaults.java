package com.codecafe.oca_prep;

class FieldInit {
    char c;
    boolean b;
    float f;
    double d;
    int i;
    byte by;
    short s;

    void printAll() {
        System.out.println("char = <" + c + ">");
        System.out.println("boolean = " + b);
        System.out.println("float = " + f);
        System.out.println("double = " + d);
        System.out.println("int = " + i);
        System.out.println("byte = " + by);
        System.out.println("short = " + s);
    }
}

public class DatatypeDefaults {

    public static void main(String[] args) {
        FieldInit f = new FieldInit();
        f.printAll();
    }

}