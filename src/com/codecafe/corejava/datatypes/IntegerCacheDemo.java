package com.codecafe.corejava.datatypes;

/*

The Integer class has a built in cache for numbers between -128 and 127

From the Integer class:

    range [-128, 127] must be interned (JLS7 5.1.7)


    public static Integer valueOf(int i) {
        if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new Integer(i);
    }

 */

public class IntegerCacheDemo {

    public static void main(String[] args) {

        Integer a = 128;
        Integer b = 128;

        System.out.println(a.equals(b)); // true
        System.out.println(a == b);      // false

        a = 127;
        b = 127;

        System.out.println(a.equals(b)); // true
        System.out.println(a == b);      // true

        a = -128;
        b = -128;

        System.out.println(a.equals(b)); // true
        System.out.println(a == b);      // true

    }

}