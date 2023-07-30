/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Janaka Ishan
 */
class CheckingAccount extends BankAccount {
    private static final double CHECKING_INTEREST_RATE = 0.02;

    @Override
    public double calculateInterest() {
        return getBalance() * CHECKING_INTEREST_RATE;
    }
}