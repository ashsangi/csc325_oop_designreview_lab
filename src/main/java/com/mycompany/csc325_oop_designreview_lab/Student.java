/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
    private int credits;
    private double GPA;

    public Student(String name, short age) {
        super(name, age);
    }

    public Student(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }
    public Student(String name, short age, int credits, double GPA) {
        super(name, age);
        this.credits = credits;
        this.GPA = GPA;
    }
    public void setCredits(int credits){
        this.credits = credits;
    }
    public int getCredits(){
        return credits;
    }

    public void setGPA(double GPA){
        this.GPA = GPA;
    }
    public double getGPA(){
        return GPA;
    }


    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    @Override
    public String toString(){
        return "Name: " + getName() + ", Age: " + getAge() + ", Credits: " + getCredits();
    }


    // ToDo 1: Make this class a child of Human

	// ToDo 2: Fix the resulting errors

	// ToDo 3: Add a field for GPA and create a setter and a getter
	
	// ToDo 4: Add comments to your code
}
