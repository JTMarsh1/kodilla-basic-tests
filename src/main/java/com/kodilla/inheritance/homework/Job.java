package com.kodilla.inheritance.homework;

public abstract class Job {

    private double salary;

    private String responsibilities;

    public Job(double salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;

    }

    public double getSalary() {
        return getSalary();
    }

    public String getResponsibilities() {
        return getResponsibilities();
    }

    public abstract String jobName();
}



