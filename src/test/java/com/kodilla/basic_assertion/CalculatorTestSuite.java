package com.kodilla.basic_assertion;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    static int a,b,c,d;

    static Calculator calculator;

    @BeforeAll
    public static void setUp() {
        a = 5;
        b = 8;
        c = 10;
        d = 5;
        calculator = new Calculator();
    }

    @Test
    public void testSum() {
        double sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        int SubtractResult = calculator.subtract(c, d);
        assertEquals(5, SubtractResult);
    }

    @Test
    public void testPow() {
        double powResult = Math.pow(c, d);
        assertEquals(100000, powResult, 0.01);
    }
}