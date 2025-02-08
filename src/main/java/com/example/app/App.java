package com.example.app;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        Calculator calc = new Calculator();
        int sum = calc.add(3, 4);
        System.out.println("The sum of 3 and 4 is: " + sum);
    }
}
