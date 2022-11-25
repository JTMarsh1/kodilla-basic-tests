package com.kodilla.inheritance.homework;

public class PersonApplication {
    public static void main(String[] args) {
        David david = new David();
        Lorenzo lorenzo = new Lorenzo();
        Technician technician = new Technician();
        Programmer programmer = new Programmer();

        System.out.println("\n W sklad firmy wchodza pracownik o imieniu: " +
                " " + david.firstName() +
                " zatrudniony na stanowisku " + david.job() +
                " lat: " + david.age() +
                " Zakres obowiazkow:  "
                + technician.getResponsibilities());

        System.out.println(" W sklad firmy wchodza pracownik o imieniu: " +
                " " + lorenzo.firstName() +
                " zatrudniona na stanowisku " + lorenzo.job() +
                " lat: " + lorenzo.age() +
                " Zakres obowiazkow:  " +
                programmer.getResponsibilities());
    }
}