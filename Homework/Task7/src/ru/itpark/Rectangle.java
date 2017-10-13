package ru.itpark;

public class Rectangle extends Square {

    private double width;
    private double p;
    private double s;

    public Rectangle(double length, double width) {
        super(length);
        this.width = width;
    }
    public void setWidth(double width) {
        if (width > 0){
            this.width = width;
        }else{
            this.width =1;
        }
    }

    public double getP() {
        return p;
    }

    public double getS() {
        return s;
    }

    public void perimeter(double length, double width){
        p = (length + width)*2;

    }
    public void area (double length, double width){
        s = length*width;
    }
}
