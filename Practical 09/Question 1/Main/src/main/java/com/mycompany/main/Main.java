/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import java.text.DecimalFormat;

/**
 *
 * @author Janaka Ishan
 */
public class Main {
    public static void main(String[] args) {
        double height = 5.0; // Replace with the desired height
        double radius = 2.0; // Replace with the desired radius

        CylindricalContainer container = new CylindricalContainer(height, radius);
        double volume = container.calculateVolume();

        // Display the volume using a DecimalFormat to format the result
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Volume of Cylindrical Container: " + df.format(volume));
    }
}

