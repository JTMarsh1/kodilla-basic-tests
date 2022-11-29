package com.kodilla.inheritance.homework;

public class Person {
    private int age;
    private String name;
    private Job job;
    public Person(int age, String name, Job job){
        this.age = age;
        this.name = name;
        this.job = job;
    }
    public void displayResponsibilities(){
        System.out.println("Responsibilities" + "  " + this.name + " is " + job.responsibilities() + " His salary is "+job.salary());
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        Person person= new Person(25,"Wacek",programmer);
        person.displayResponsibilities();

        Technician technician = new Technician();
        Person person1 = new Person(54,"Daniel", technician);
        person1.displayResponsibilities();
    }



}
