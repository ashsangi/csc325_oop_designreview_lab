package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student{
    public Freshman(String name, short age, int credits, double GPA) {
        super(name, age, credits, GPA);
    }
    @Override
    public String toString(){
        return "Name: " + getName() + ", Age: " + getAge() + ", Credits: " + getCredits() + ", GPA: " + getGPA();
    }
}
