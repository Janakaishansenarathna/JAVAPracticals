/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testshape;

/**
 *
 * @author Janaka Ishan
 */
public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implement the abstract method "calculateArea" for Rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }
}
