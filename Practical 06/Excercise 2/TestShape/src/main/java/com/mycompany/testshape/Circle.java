/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testshape;

/**
 *
 * @author Janaka Ishan
 */
public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement the abstract method "calculateArea" for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
