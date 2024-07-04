package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student{
    public Senior(String name, short age, int credits, double GPA) {
        super(name, age, credits, GPA);
        if (credits < 85) {
            throw new IllegalArgumentException("Senior must have at least 85 credits");
        }
    }
    @Override
    public String toString(){
        return "Name: " + getName() + ", Age: " + getAge() + ", Credits: " + getCredits() + ", GPA: " + getGPA();
    }
}
