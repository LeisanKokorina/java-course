package ru.itpark;

public class Ellipse extends Circle {
    private double a;
    private double b;
    private double p;
    private double s;

    public Ellipse(double radius, double a, double b) {
        super(radius);
        this.a = a;
        this.b = b;
    }

    public void setA(double a) {
        if (a >0){
            this.a = a;
        }else {
            this.a = 1;
        }
    }

    public void setB(double b) {
        if (b >0){
            this.b = b;
        }else {
            this.b = 1;
        }
    }

    public double getP() {
        return p;
    }

    public double getS() {
        return s;
    }

    public void perimeter (double radius, double a, double b){
        p = (4* PI * a * b + (a - b))/(a + b);
    }
    public void area (double a, double b){
        s = PI * a * b;
    }
}
