package com.jedi.qa;

import java.io.IOException;

public class Main {
    public static void functionToPrintNumber()
    {
        // Our first function
        int number = 6;
        System.out.println("Number: " + number);
    }

    // Petya has started programming
    public static void main(String[] args) throws IOException {
        int a = 5;
        int b = 2;

        int c = a * 2 + b;

        functionToPrintNumber();
    }
}
