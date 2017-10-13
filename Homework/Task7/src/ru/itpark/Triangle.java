package ru.itpark;

public class Triangle  {
    private double firstSide;
    private double secSide;
    private double thirdSide;

    private double p;
    private double s;

    public Triangle() {
    }

    public void setFirstSide(double firstSide) {
        if (firstSide > 0){
            this.firstSide = firstSide;
        }else{
            this.firstSide =1;
        }
    }

    public void setSecSide(double secSide) {
        if (secSide > 0){
            this.secSide = secSide;
        }else{
            this.secSide =1;
        }
    }

    public void setThirdSide(double thirdSide) {
        if (thirdSide > 0){
            this.thirdSide = thirdSide;
        }else{
            this.thirdSide =1;
        }
    }

    public double getP() {
        return p;
    }

    public double getS() {
        return s;
    }

    public  void perimeter (double a, double b, double c){
         p = a + b + c;

    }
    public  void area (double a, double b, double c){
        double x = (a + b + c)/2;
         s = Math.sqrt(x*(x-a)*(x-b)*(x-c));
    }
}
