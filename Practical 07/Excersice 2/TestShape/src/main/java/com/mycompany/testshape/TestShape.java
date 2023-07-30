/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testshape;

/**
 *
 * @author Janaka Ishan
 */
public class TestShape {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        Circle circle = new Circle(2.5);

        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        rectangle.display();

        System.out.println("Area of Circle: " + circle.calculateArea());
        circle.display();
    }
}

