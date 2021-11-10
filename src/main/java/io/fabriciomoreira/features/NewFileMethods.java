package io.fabriciomoreira.features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NewFileMethods {
    public void execute() throws IOException {
        Path path = Files.createTempFile("temp", ".txt");
        Files.writeString(path, "Simple example to write in a file", StandardOpenOption.APPEND);

        System.out.println(Files.readString(path));
        System.out.println("Written in file: " + path.toAbsolutePath());
    }
}
/*
* Using these overloaded methods, Java 11 aims to reduce a lot of boilerplate code which makes much easier to read and write files.
* These methods allow reading and writing a string directly in the file
* */