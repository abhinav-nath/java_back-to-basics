# Records - since Java 14

As of JDK 14, we can replace our repetitious data classes (POJOs and DTOs) with records.

> Records are immutable data classes that require only the type and name of fields.

Below are the properties of records:

- records are `final` and hence cannot be extended
- fields are `final`
- no setters
- cannot extend any other class as records by default extend the `Record` class
- can implement interfaces

Records by default have:

- A Canonical Constructor
- Getters
- `equals()`
- `hashCode()`
- `toString()`

We can additionally have:

- Compact Constructor
- Multiple Constructors
- `static` methods and variables