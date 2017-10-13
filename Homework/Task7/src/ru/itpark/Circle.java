package ru.itpark;

public class Circle  {
    protected double radius;
    protected final double PI = 3.14;
    private double p;
    private double s;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        if(radius > 0) {
            this.radius = radius;
        }else{
            this.radius = 1;
        }
    }

    public double getP() {
        return p;
    }

    public double getS() {
        return s;
    }

    public void perimeter (double radius){
        p = 2*PI*radius;
    }
    public void area(double radius){
        s = PI*Math.pow(radius,2);
    }
}
