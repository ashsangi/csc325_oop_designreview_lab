/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
     // ToDo 5: Fix the error
     // ToDo 6: Fix the constructor of the Student class
     // Todo 7: Create two classes for Freshman and Senior
     // ToDo 8: The senior class should have a minimum of 85 credits
     // ToDo 9: Add a toString method for the Student class
     // ToDo 10: Add a toString method for the Freshman class
     // ToDo 11: Add a toString method for the Senior class
     // ToDo 12: Set the gpa of the student using the scanner and user
     //  input and then print the output.
     // ToDo 13: add comments and explain your code
     Student std1= new Student("James", (short) 20);
     Freshman std2= new Freshman("James", (short) 20, 12, 0); // name, age, credits
     Senior std3 = new Senior("John", (short) 30, 90, 0);

     Scanner scnr = new Scanner(System.in);
     System.out.println("Freshman GPA: ");
     double GPA = scnr.nextDouble();
     std2.setGPA(GPA);
     System.out.println("Senior GPA: ");
     GPA = scnr.nextDouble();
     std3.setGPA(GPA);
     System.out.println(std2);
     System.out.println(std3);
	}

}

