# Steps to make a class Immutable

1. Make the class as `final` to protect it from being extended


2. Add an all-args constructor


3. Remove all setter methods


4. If the class holds a mutable object:

  - Inside the constructor, make sure to use a clone copy of the passed argument and never set your mutable field to the real instance passed through constructor, this is to prevent the clients who
    pass the object from modifying it afterwards.

  - Make sure to always return a clone copy of the field and never return the real object instance.


5) Make all your fields `final`, so that they're initialized only once inside the constructor and never modified afterward.