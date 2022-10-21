package io.codelex.classesandobjects.practice;

public class BankAccount {
    private final String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }


    public final void deposit(double amount) {
        balance += amount;
    }

    public final void withdraw(double amount) {
        balance -= amount;
    }

    public String toString() {
        String s = "";
        String minus = "";
        if (balance < 0) {
            balance *= -1;
            minus = "-";
        }
        s = name + ", " + minus + "$" + String.format("%.2f", balance);
        return s;
    }

}
