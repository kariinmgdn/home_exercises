package io.codelex.classesandobjects.practice.savingaccount;

public class SavingsAccount {

    private final double rate;
    private final double balance;

    public SavingsAccount(double rate, double balance) {
        this.rate = rate;
        this.balance = balance;
    }

    public double monthlyInterestRate() {
        return Math.round(rate / 12d * this.balance * 100d) / 100d;
    }

    public double deposit(double d) {
        return Math.round((d + this.balance) * 100d) / 100d;
    }

    public double withdrawal(double w) {
        return this.balance + w;
    }
}
