package com.codecafe.corejava.immutability;

// make class as final
public final class ImmutableStudent {

    // make data members final
    private final int id;
    private final String name;

    private final DateOfBirth dob; // mutable data type

    public ImmutableStudent(int id, String name, DateOfBirth dob) {
        this.id = id;
        this.name = name;

        // create a clone of DateOfBirth object and return a new object every time
        DateOfBirth dobClone = new DateOfBirth();
        dobClone.setDay(dob.getDay());
        dobClone.setMonth(dob.getMonth());
        dobClone.setYear(dob.getYear());
        this.dob = dobClone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // is.getAge().setYear(1993); can break immutability
    // handle this scenario in getDob()
    public DateOfBirth getDob() {
        // create a clone of DateOfBirth object and return a new object every time
        DateOfBirth dobClone = new DateOfBirth();
        dobClone.setDay(dob.getDay());
        dobClone.setMonth(dob.getMonth());
        dobClone.setYear(dob.getYear());
        return dobClone;
    }

}