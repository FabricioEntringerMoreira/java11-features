package io.fabriciomoreira;

import io.fabriciomoreira.features.*;

public class Main {
    public static void main(String[] args) {

        new LocalVariableLambda().execute();
        new NewStringMethods().execute();
        try {
            new NewFileMethods().execute();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        new newToArrayMethod().execute();
        new MethodIsEmptyInOptional().execute();
    }
}
