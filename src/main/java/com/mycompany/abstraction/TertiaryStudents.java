/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstraction;

/**
 *
 * @author Khen
 */
public class TertiaryStudents extends Students{
    public void gradeEntry(){
        System.out.print("Midterm: ");
        grade1 = input.nextInt();
        System.out.print("Final: ");
        grade2 = input.nextInt();
    }
}
