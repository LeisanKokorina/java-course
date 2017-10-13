package ru.itpark;

public class Square  {

    protected double length;
    private double p;
    private double s;

    public Square(double length) {
        this.length = length;
    }

    public void setLength(double length) {
        if (length > 0){
            this.length = length;
        }else{
            this.length =1;
        }
    }

    public double getP() {
        return p;
    }

    public double getS() {
        return s;
    }

    public void perimeter(double length) {

        p = 4*length;
    }
    public void area (double length) {
        s = length*length;
    }
}
