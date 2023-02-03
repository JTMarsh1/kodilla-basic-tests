package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;
    private int size;

    public Bank() {
        this.cashMachines = new CashMachine[0];
        this.size = 0;
    }

    public void add(CashMachine cashMachine) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.size - 1] = cashMachine;
        this.cashMachines = newTab;
    }

    public CashMachine[] cashMachines() {
        return cashMachines;
    }

    public int getAllBalance() {
        int allBalance = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            CashMachine cashMachine = cashMachines[i];
            allBalance += cashMachine.getBalance();
        }
        return allBalance;
    }

    public int getAllSumOfWithdrawls() {
        int allSumOfWithdrawals = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            allSumOfWithdrawals += cashMachines[i].getSumOfWithdrawls();
        }
        return -allSumOfWithdrawals;
    }

    public int getAllSumOfPayment() {
        int allSumOfPayment = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            allSumOfPayment += cashMachines[i].getSumOfPayment();
        }
        return allSumOfPayment;
    }

    public double getAllPaymentAverage() {
        int counterPayment = getAllSumOfPayment();
        if (counterPayment == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += cashMachines[i].getAmountOfPayment();
        }
        return sum / counterPayment;

    }

    public double getAllWithdwarlAverage() {
        int counterWithdwarl = getAllSumOfWithdrawls();
        if (counterWithdwarl == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += cashMachines[i].getAmountOfWithdrawals();
        }
        return sum / counterWithdwarl;
    }
}