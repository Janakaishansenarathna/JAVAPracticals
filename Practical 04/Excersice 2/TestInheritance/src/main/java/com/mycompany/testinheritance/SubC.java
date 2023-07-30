/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testinheritance;

/**
 *
 * @author Janaka Ishan
 */
public class SubC extends SuperB {
    void triple() {
        x = x + 3; // override existing method
    }
    void quadruple() {
        x = x * 4; // new method
    }
}
