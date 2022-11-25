package com.kodilla.inheritance.homework;

public class Application {
    public static void main(String[] args) {
        Shape square = new Square(2, 2);
        System.out.println("Pole kwadratu "+ " = " + square.calculateSurfaceArea());
        System.out.println("Obwod"+ " = "  + square.calculateCircuit());
    }
}
