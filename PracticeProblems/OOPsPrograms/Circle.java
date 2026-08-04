package PracticeProblems.OOPsPrograms;


// Created a child class named Circle which is subclass of Shape class.
public class Circle extends Shape{
    public double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }

}
