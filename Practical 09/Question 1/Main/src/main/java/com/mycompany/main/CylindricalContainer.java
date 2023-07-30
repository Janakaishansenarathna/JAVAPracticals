/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;
import java.text.DecimalFormat;
/**
 *
 * @author Janaka Ishan
 */
public class CylindricalContainer extends Container {
    public CylindricalContainer(double height, double radius) {
        super(height, radius);
    }

    @Override
    public double calculateVolume() {
        double radius = getRadius();
        double height = getHeight();
        double volume = Math.PI * radius * radius * height;
        return volume;
    }
}

