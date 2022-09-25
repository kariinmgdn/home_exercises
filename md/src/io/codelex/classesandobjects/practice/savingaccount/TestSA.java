package io.codelex.classesandobjects.practice.savingaccount;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestSA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How much money is in the account?: ");
        double balance = sc.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        double rate = sc.nextDouble();
        SavingsAccount acc = new SavingsAccount(balance, rate);
        System.out.print("How long has the account been opened? ");
        int open = sc.nextInt();
        double sumDep = 0;
        double sumWithdrawn = 0;
        double sumInt = 0;
        for (int i = 1; i <= open; i++) {

            System.out.print("Enter amount deposited for month " + i + ": ");
            double dep = sc.nextDouble();
            System.out.print("Enter amount withdrawn for " + i + ": ");
            double with = sc.nextDouble();
            sumDep += acc.deposit(dep);
            sumWithdrawn += acc.withdrawal(with);
            sumInt += acc.monthlyInterestRate();
        }
        System.out.println("Total deposited: $" + String.format("%.2f", sumDep));
        System.out.println("Total withdrawn: $" + String.format("%.2f", sumWithdrawn));
        System.out.println("Interest earned: $" + sumInt);
        double sum = sumDep + sumWithdrawn + sumInt;
        System.out.println("Ending balance: $" + sum);

    }
}
