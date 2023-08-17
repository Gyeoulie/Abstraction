/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstraction;

/**
 *
 * @author Khen
 */
public class SHSStudents extends Students{
    int grade3;
    public void gradeEntry(){
        System.out.print("Prelim: ");
        grade1 = input.nextInt();
        System.out.print("Midterm: ");
        grade2 = input.nextInt();
        System.out.print("Finals: ");
        grade3 = input.nextInt();
    }
    
    public void calculateGrade(){
        ave = (grade1 + grade2 + grade3) / 3;
        System.out.println("Average is: "+ave);
        System.out.print("Remarks: ");
        if(ave >= 75){
            System.out.println("Passed!");
        }
        else{
            System.out.println("Failed!");
        }
    }
}
