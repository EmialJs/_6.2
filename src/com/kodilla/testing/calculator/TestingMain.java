package com.kodilla.testing.calculator;
public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int addResult = calculator.add(2, 2);
        if (addResult == 4) {
            System.out.println("Add test OK");
        } else {
            System.out.println("Error in add method");
        }

        int subtractResult = calculator.subtract(4, 2);
        if (subtractResult == 2) {
            System.out.println("Subtract test OK");
        } else {
            System.out.println("Error in subtract method");
        }
    }
}
