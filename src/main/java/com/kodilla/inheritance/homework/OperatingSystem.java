package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year) {
        this.year = year;
    }

    public void turnOn() {
        System.out.println("Welcome to the system ");
    }

    public void turnOff() {
        System.out.println("The system is shutting down");

    }
}
