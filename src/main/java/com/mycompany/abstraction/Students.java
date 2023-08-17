/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstraction;

/**
 *
 * @author Khen
 */
import java.util.Scanner;

abstract class Students {

    public static Scanner input = new Scanner(System.in);
    String name, gender, yrlvl;
    int grade1, grade2, ave;

    public void profile() {
        System.out.print("Name: ");
        name = input.next();
        System.out.print("Gender: ");
        gender = input.next();
        System.out.print("Year Level: ");
        yrlvl = input.next();
    }
    
    public abstract void gradeEntry();

    public void calculateGrade() {
        ave = (grade1 + grade2) / 2;
        System.out.println("Average is: " + ave);
        System.out.print("Remarks: ");
        if (ave >= 75) {
            System.out.print("Passed!");
        } else {
            System.out.print("Failed!");
        }
    }
}
