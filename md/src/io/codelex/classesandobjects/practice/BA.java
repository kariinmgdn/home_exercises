package io.codelex.classesandobjects.practice;

public class BA {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Name", 10);
        bankAccount.deposit(5);
        System.out.println(bankAccount);
        bankAccount.withdraw(100.44);
        System.out.println(bankAccount);
    }
}
