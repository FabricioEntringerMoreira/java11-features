package io.fabriciomoreira.features;

import javax.annotation.Nonnull;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class LocalVariableLambda {

    public void execute(){
        List<String> nameList = Arrays.asList("Peter", "John", "Paul");
        String result = nameList
                .stream()
                .map( (@Nonnull var nom) -> nom.toUpperCase(Locale.ROOT))
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
    /*
    * JEP 232
    * Feature: Allowing "var" to be used when declaring the formal parameters of implicitly typed lambda expressions.
    * Goal: The goal is to align the syntax of a formal parameter declaration in an implicitly typed lambda expression with the syntax of a local variable declaration.
    * Benefits: Standardization, use of annotation in the lambda local var
    * */
}
