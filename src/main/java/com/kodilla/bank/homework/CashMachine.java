package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.transactions = new int[0];
    }

    public void add(int transaction) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = transaction;
        this.transactions = newTab;
    }

    public int[] getTransactions() {

        return transactions;
    }

    public int getBalance() {
        if (this.transactions.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            sum += this.transactions[i];
        }
        return sum;
    }

    public int getSumOfWithdrawls() {
        int sumOfWithdrawals = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] < 0) {
                sumOfWithdrawals += transactions[i];
            }
        }
        return -sumOfWithdrawals;
    }

    public int getAmountOfWithdrawals() {
        int amountOfWithdrawals = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] < 0)
                amountOfWithdrawals++;
        }
        return amountOfWithdrawals;
    }

    public int getSumOfPayment() {
        int sumOfPayment = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] > 0) {
                sumOfPayment += transactions[i];
            }
        }
        return sumOfPayment;
    }

    public int getAmountOfPayment() {
        int amountOfPayment = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] > 0) {
                amountOfPayment++;
            }
        }
        return amountOfPayment;
    }
}