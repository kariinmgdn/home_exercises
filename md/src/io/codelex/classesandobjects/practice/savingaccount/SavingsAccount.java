package io.codelex.classesandobjects.practice.savingaccount;

public class SavingsAccount {

    private double rate;
    private double balance;

    public SavingsAccount(double rate, double balance) {
        this.rate = rate;
        this.balance = balance;
    }

    public double monthlyInterestRate() {
        return rate / 12d * this.balance;
    }

    public double deposit(double d) {
        return d + this.balance;
    }

    public double withdrawal(double w) {
        return this.balance + w;
    }
}
