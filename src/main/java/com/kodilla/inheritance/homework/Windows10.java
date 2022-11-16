package com.kodilla.inheritance.homework;

public class Windows10 extends OperatingSystem {
    public Windows10(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("Welcome to the system Windows10");
    }

    @Override
    public void turnOff() {
        System.out.println("The system is shutting down Windows10");
    }
}
