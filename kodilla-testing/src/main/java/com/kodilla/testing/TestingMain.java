package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        Calculator calculator = new Calculator();

        if (calculator.add(250, 1000) == 1250) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        if (calculator.subtract(250, 1000) == 750) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}