package io.fabriciomoreira.features;

import java.util.stream.Collectors;

public class NewStringMethods {
    public void execute() {
        String strText = "   The new methods are isBlank, lines, strip, stripLeading, stripTrailing, and repeat. \nLet's check how each one works!";
        String strBlank = "";
        System.out.println(strText);

        System.out.println("Method isBlank for the last text: " + strText.isBlank());
        System.out.println("Method isBlank for the empty string: " + strBlank.isBlank());
        System.out.println(" ");
        System.out.println("Method lines for the last text: " + strText
                .lines()
                .map(str -> str.replace(" ", ""))
                .collect(Collectors.joining(" ")));
        System.out.println(" ");
        System.out.println("Method strip for the last text: " + strText.strip());
        System.out.println(" ");
        System.out.println("Method repeat (5 times) for the last text: " + strText.repeat(5));
        System.out.println(" ");
    }
}
