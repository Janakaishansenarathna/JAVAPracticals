/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testperson;

/**
 *
 * @author Janaka Ishan
 */
public class TestPerson {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        student.setID(101);
        student.setCourse("Computer Science");

        Lecturer lecturer = new Lecturer();
        lecturer.setName("Dr. Smith");
        lecturer.setID(201);
        lecturer.setProg("Data Science");

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getID());
        System.out.println("Student Course: " + student.getCourse());

        System.out.println("Lecturer Name: " + lecturer.getName());
        System.out.println("Lecturer ID: " + lecturer.getID());
        System.out.println("Lecturer Programme: " + lecturer.getProg());
    }
}