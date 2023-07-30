/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testshape;

/**
 *
 * @author Janaka Ishan
 */
public interface Shape {
    // Declare an abstract method called "calculateArea"
    double calculateArea();

    // Declare a non-abstract method called "display"
    default void display() {
        System.out.println("Shape");
    }
}
