/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstraction;

/**
 *
 * @author Khen
 */
public class Main {
    public static void main(String[] args) {
        var ts = new TertiaryStudents();
        var shs = new SHSStudents();
        var elem = new ElementaryStudents();
        
        
        System.out.println("-----------------Tertiary-----------------");
        ts.profile();
        ts.gradeEntry();
        ts.calculateGrade();
        System.out.println("\n-----------------SHS-----------------");
        shs.profile();
        shs.gradeEntry();
        shs.calculateGrade();
        System.out.println("-----------------ELEM-----------------");
        elem.profile();
        elem.gradeEntry();
        elem.calculateGrade();
        
    }
}
