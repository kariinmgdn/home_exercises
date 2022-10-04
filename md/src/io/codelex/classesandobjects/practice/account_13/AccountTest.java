package io.codelex.classesandobjects.practice.account_13;

public class AccountTest {
    public static void main(String[] args) {
        Account bartosAccount = new Account("Barto's account", 100.00);
        bartosAccount.deposit(20);
        System.out.println(bartosAccount);

        Account mattsAcc = new Account("Matt's account", 1000);
        Account myAcc = new Account("My account", 0);
        mattsAcc.withdrawal(100);
        myAcc.deposit(100);
        System.out.println(mattsAcc);
        System.out.println(myAcc);

        Account A = new Account("A", 100);
        Account B = new Account("B", 0);
        Account C = new Account("C", 0);
        Account.transfer(A, B, 50);
        Account.transfer(B, C, 25);

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);


    }
}
