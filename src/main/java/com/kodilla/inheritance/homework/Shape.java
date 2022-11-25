package com.kodilla.inheritance.homework;

public abstract class Shape {

    private double surfaceArea;

    private double circuit;

    public Shape(double surFaceArea, double circuit) {
        this.surfaceArea = surfaceArea;
        this.circuit = circuit;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public double getCircuit() {
        return circuit;

    }

    public abstract double calculateSurfaceArea();

    public abstract double calculateCircuit();

}
