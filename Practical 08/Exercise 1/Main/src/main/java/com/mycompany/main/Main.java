/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author Janaka Ishan
 */
public class Main {
    public static void main(String[] args) {
        double checkingBalance = 1000000; // 1 million
        double savingsBalance = 20000000; // 20 million

        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setBalance(checkingBalance);

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setBalance(savingsBalance);

        double checkingInterest = checkingAccount.calculateInterest();
        double savingsInterest = savingsAccount.calculateInterest();

        System.out.println("Interest for Checking Account: $" + checkingInterest);
        System.out.println("Interest for Savings Account: $" + savingsInterest);
    }
}