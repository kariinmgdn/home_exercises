package io.codelex.classesandobjects.practice;

public class BA {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("Name", 10);
        ba.deposit(5);
        System.out.println(ba);
        ba.withdraw(100.44);
        System.out.println(ba);
    }
}
