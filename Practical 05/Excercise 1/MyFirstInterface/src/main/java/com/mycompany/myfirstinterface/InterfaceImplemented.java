/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myfirstinterface;

/**
 *
 * @author Janaka Ishan
 */
public class InterfaceImplemented implements MyFirstInterface {
   
// Override the abstract method "display()"
    @Override
    public void display() {
        // Try to change the value of "x" inside this method
        // This will cause a compilation error since the variable "x" in the interface is implicitly final
        // x = 20;

        // Print the value of "x"
        System.out.println("Value of x: " + x);
    }
}
