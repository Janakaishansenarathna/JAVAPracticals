/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Janaka Ishan
 */
class SavingsAccount extends BankAccount {
    private static final double SAVINGS_INTEREST_RATE = 0.12;

    @Override
    public double calculateInterest() {
        return getBalance() * SAVINGS_INTEREST_RATE;
    }
}