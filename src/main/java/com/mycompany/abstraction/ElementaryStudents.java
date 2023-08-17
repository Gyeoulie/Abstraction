/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstraction;

/**
 *
 * @author Khen
 */
public class ElementaryStudents extends Students{
    int grade3, grade4;
    public void gradeEntry(){
        System.out.print("First Grading: ");
        grade1 = input.nextInt();
        System.out.print("Second Grading: ");
        grade2 = input.nextInt();
        System.out.print("Third Grading: ");
        grade3 = input.nextInt();
        System.out.print("Fourth Grading: ");
        grade4 = input.nextInt();
    }
    
    public void calculateGrade(){
        ave = (grade1 + grade2 + grade3 + grade4) / 4;
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
