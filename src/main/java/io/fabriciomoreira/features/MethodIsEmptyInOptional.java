package io.fabriciomoreira.features;

import java.util.Optional;

public class MethodIsEmptyInOptional {
    public void execute() {
        String name = null;
        if (Optional.ofNullable(name).isEmpty() == !Optional.ofNullable(name).isPresent())
            System.out.println("To prove that: isEmpty = ! isPresent.");
        name = "new name";
        if (Optional.ofNullable(name).isEmpty() != Optional.ofNullable(name).isPresent())
            System.out.println("To prove that: isEmpty = ! isPresent.");
    }
}

/*
Optional is a container object which may or may not contain a non-null value. If no value is present, the object is considered empty.

Previously existing method isPresent() returns true if a value is present, otherwise false. Sometimes, it forces us to write negative conditions which are not readable.

isEmpty() method is reverse of isPresent() method and returns false if a value is present, otherwise true.
* */
