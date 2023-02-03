package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void sholudCheckAddTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(350);
        cashMachine.add(50);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(2, transactions.length);
        assertEquals(350, transactions[0]);
        assertEquals(50, transactions[1]);
    }


    @Test
    public void shouldCheckBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(50);
        cashMachine.add(500);
        cashMachine.add(-200);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(350, cashMachine.getBalance());
    }

    @Test
    public void shouldCheckSumofWithdwarls() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-300);
        cashMachine.add(-350);
        cashMachine.add(-50);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(700, cashMachine.getSumOfWithdrawls());         //wartość wypłat musi być wartością dodatnią
    }

    @Test
    public void sholudCheckAmountOfWithdwarls() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-650);
        cashMachine.add(-200);
        cashMachine.add(50);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(2, cashMachine.getAmountOfWithdrawals());
    }

    @Test
    public void sholudCheckSumOfPayment() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-200);
        cashMachine.add(-200);
        cashMachine.add(50);
        cashMachine.add(-100);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(50, cashMachine.getSumOfPayment());
    }

    @Test
    public void sholudCheckAmountOfPayment() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-200);
        cashMachine.add(300);
        cashMachine.add(50);
        cashMachine.add(-100);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(2, cashMachine.getAmountOfPayment());
    }
}