package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);

        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla " + "liczby" + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla" + " liczby" + a + " i " + b);
        }

        Calculator calculator1 = new Calculator();
        a = 8;
        b = 6;
        int substractResult = calculator1.subtract(a, b);

        boolean okey = ResultChecker.assertEquals(2, substractResult);
        if (okey) {
            System.out.println("Metoda odejmowania działa poprawnie " + "dla liczby " + a + " i " + b);
        } else {
            System.out.println("Metoda odejmowania nie działa poprawnie dla " + "liczby " + a + " i " + b);
        }

        Calculator calculator2 = new Calculator();
        a = 10;
        b = 3;
        double powResult = calculator2.powResult(a, b);
        boolean oki = ResultChecker.assertEquals(1000, powResult);
        if (oki) {
            System.out.println("Metoda potegowania dziala poprawnie" + " dla potegi " + a);

        } else {
            System.out.println("Metoda potegowania nie działa poprawnie " + "dla potegi " + a);
        }
    }
}
