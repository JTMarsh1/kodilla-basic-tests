package com.kodilla.inheritance.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Pole kwadratu " + square.AreaOfTheSquare() + " Obwód kwadratu" + square.perimeterOfTheSquare());
    }
}

