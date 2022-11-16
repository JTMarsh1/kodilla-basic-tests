package com.kodilla.inheritance.homework;

public class Windows7 extends OperatingSystem {
    public Windows7(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("Welcome to the system Windows7");
    }

    @Override
    public void turnOff() {
        System.out.println("The system is shutting down Windows7");
    }
}
