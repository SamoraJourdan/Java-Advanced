/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author pc
 */
public class Main {

    public static void main(String[] args) {
        Employee jane = new Employee("Jane Doe", "Manager", "HR", 65000);
        Employee john = new Employee("John Doe", "Staff", "HR", 55000);

        System.out.println("Jane's withholding: " + jane.getWithholding());
        System.out.println("John's bonus " + john.getBonus());
    }
}
