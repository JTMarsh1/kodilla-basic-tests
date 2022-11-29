package com.kodilla.inheritance.homework;

public class Square extends Shape {
    private double sideA;

    public Square(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public double AreaOfTheSquare() {
        return sideA * sideA;
    }

    @Override
    public double perimeterOfTheSquare() {
        return sideA * 4;
    }
}
