package io.fabriciomoreira.features;

import java.util.ArrayList;
import java.util.List;

public class newToArrayMethod {
    public void execute(){
        List<String> listString = new ArrayList<>();
        listString.add("John");
        listString.add("Peter");
        listString.add("Paul");

        String[] arrayString1 = listString.toArray(new String[listString.size()]); // Before Java 11

        String[] arrayString2 = listString.toArray(String[]::new); // After Java 11

        System.out.println(" ");
        System.out.println(arrayString1.length);
        System.out.println(arrayString2.length);
    }
}

/*
* Before Java 11, converting a collection to array was not straightforward. Java 11 makes the conversion more convenient.
* It brings more legible and simple code
* */
