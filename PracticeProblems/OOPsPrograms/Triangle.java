package PracticeProblems.OOPsPrograms;

public class Triangle extends Shape{
    public double height;
    public double base;

    public Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea(){
        return 0.5*base*height;
    }
}
