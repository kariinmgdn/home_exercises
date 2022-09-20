package io.codelex.classesandobjects.practice.savingaccount;

import java.util.Scanner;

public class TestSA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How much money is in the account?:");
        double balance = sc.nextDouble();
        System.out.print("Enter the annual interest rate:");
        double rate = sc.nextDouble();
        SavingsAccount acc = new SavingsAccount(balance, rate);
        System.out.print("How long has the account been opened?");
        int open = sc.nextInt();
        double sumDep = 0;
        double sumWithdrawn = 0;
        double sumInt = 0;
        for (int i = 1; i <= open; i++) {

            System.out.print(i + ": ");
            double dep = sc.nextDouble();
            System.out.print(i + ": ");
            double with = sc.nextDouble();
            sumDep += acc.deposit(dep);
            sumWithdrawn += acc.withdrawal(with);
            sumInt += acc.monthlyInterestRate();
        }
        System.out.println("Total deposited: " + sumDep);
        System.out.println("Total withdrawn: " + sumWithdrawn);
        System.out.println("Interest earned: " + Math.round(sumInt * 100d) / 100d);
        double sum = sumDep + sumWithdrawn + sumInt;
        System.out.println("Ending balance: " + Math.round(sum * 100d) / 100d);

    }
}
