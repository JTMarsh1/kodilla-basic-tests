package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldCheckAllBalance(){
        Bank bank = new Bank();
        CashMachine Zmigrodzka = new CashMachine();
        CashMachine rynek = new CashMachine();
        CashMachine Paprotna = new CashMachine();
        bank.add(Zmigrodzka);
        bank.add(rynek);
        bank.add(Paprotna);
        Zmigrodzka.add(350);
        rynek.add(250);
        Paprotna.add(-150);


        assertEquals(450, bank.getAllBalance());
    }

    @Test
    public void shouldCheckAllSumOfWithdrawls(){
        Bank bank = new Bank();
        CashMachine Zmigrodzka = new CashMachine();
        CashMachine rynek = new CashMachine();
        CashMachine Paprotna = new CashMachine();
        bank.add(Zmigrodzka);
        bank.add(rynek);
        bank.add(Paprotna);

        Zmigrodzka.add(350);
        rynek.add(-250);
        Paprotna.add(-150);

        assertEquals(-400, bank.getAllSumOfWithdrawls());

    }

    @Test
    public void shouldCheckAllSumOfPayment(){
        Bank bank = new Bank();
        CashMachine Zmigrodzka = new CashMachine();
        CashMachine rynek = new CashMachine();
        CashMachine Paprotna = new CashMachine();
        bank.add(Zmigrodzka);
        bank.add(rynek);
        bank.add(Paprotna);

        Zmigrodzka.add(350);
        rynek.add(250);
        Paprotna.add(-150);

        assertEquals(600, bank.getAllSumOfPayment());
    }

    @Test
    public void shouldCheckAllPaymentAverage(){
        Bank bank = new Bank();
        CashMachine Zmigrodzka = new CashMachine();
        CashMachine rynek = new CashMachine();
        CashMachine Paprotna = new CashMachine();
        bank.add(Zmigrodzka);
        bank.add(rynek);
        bank.add(Paprotna);

        Zmigrodzka.add(350);
        rynek.add(250);
        Paprotna.add(-150);

        assertEquals(300,bank.getAllPaymentAverage());
    }

    @Test
    public void shouldCheckAllWithdwarlAverage(){
        Bank bank = new Bank();
        CashMachine Zmigrodzka = new CashMachine();
        CashMachine rynek = new CashMachine();
        CashMachine Paprotna = new CashMachine();
        bank.add(Zmigrodzka);
        bank.add(rynek);
        bank.add(Paprotna);

        Zmigrodzka.add(350);
        rynek.add(250);
        Paprotna.add(-150);

        assertEquals(-150, bank.getAllWithdwarlAverage());

    }
}