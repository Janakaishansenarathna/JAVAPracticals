/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dog;

/**
 *
 * @author Janaka Ishan
 */
public class Dog extends Mammal {
    public static void main(String args[]) {
        Animal a = new Animal();
        Mammal m = new Mammal();
        Dog d = new Dog();
        System.out.println(m instanceof Animal); // Output: true
        System.out.println(d instanceof Mammal); // Output: true
        System.out.println(d instanceof Animal); // Output: true
    }
}
