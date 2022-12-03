package com.kodilla.basic_assertion;

public class Calculator {
    private double delta;
    private double[] values;

    public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double powResult(double a, double b) {
        return Math.pow(a, b);
    }

    public double getAverage() {
        if (this.values.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.values.length; i++) {
            sum += this.values[i];
        }
        return sum / this.values.length;
    }
}

