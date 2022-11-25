package com.kodilla.inheritance.homework;

public class Square extends Shape {

    double sideA = 2;

    double resultOfSurfaceArea = sideA * sideA;

    double resultOfCircuit = 4 * sideA;

    public Square(double surFaceArea, double circuit) {
        super(surFaceArea, circuit);
    }

    public double calculateSurfaceArea() {

        return resultOfSurfaceArea;
    }

    public double calculateCircuit() {

        return resultOfCircuit;
    }
}
