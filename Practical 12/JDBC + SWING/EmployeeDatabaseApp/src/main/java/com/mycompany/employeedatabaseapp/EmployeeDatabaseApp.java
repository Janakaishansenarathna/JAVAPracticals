/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeedatabaseapp;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import ui.MainFrame;

/**
 *
 * @author Janaka Ishan
 */
public class EmployeeDatabaseApp {

    public static void main(String[] args) {
        // Initialize the database connection

        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }

}
