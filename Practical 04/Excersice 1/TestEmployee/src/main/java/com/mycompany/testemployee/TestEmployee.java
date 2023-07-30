/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testemployee;

/**
 *
 * @author Janaka Ishan
 */
public class TestEmployee {
    public static void main(String[] args) {
        Employee bogdan = new Employee();
        bogdan.setEmpID(101);
        bogdan.setEmpName("Mr. Bogdan");
        bogdan.setEmpDesignation("Software Engineer");

        Employee bird = new Employee();
        bird.setEmpID(102);
        bird.setEmpName("Ms. Bird");
        bird.setEmpDesignation("Data Analyst");

        System.out.println("Employee ID: " + bogdan.getEmpID());
        System.out.println("Employee Name: " + bogdan.getEmpName());
        System.out.println("Employee Designation: " + bogdan.getEmpDesignation());

        System.out.println("Employee ID: " + bird.getEmpID());
        System.out.println("Employee Name: " + bird.getEmpName());
        System.out.println("Employee Designation: " + bird.getEmpDesignation());
    }
}