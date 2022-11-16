package com.kodilla.inheritance.homework;

public class Main {
    public static void main(String[] args) {
        Windows10 windows10 = new Windows10(2019);
        windows10.turnOn();
        windows10.turnOff();

        Windows7 windows7 = new Windows7(2009);
        windows7.turnOn();
        windows7.turnOff();
    }
}
