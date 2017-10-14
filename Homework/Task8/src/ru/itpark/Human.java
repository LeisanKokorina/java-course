package ru.itpark;

public class Human  {
    private String name;
    protected double height;
    protected int age;
    protected double weight;



    public Human(String name, double height, int age, double weight) {
        this.name = name;
        if(height > 0) {
            this.height = height;
        }else {this.height = 1 ;}
        if (age > 0) {
            this.age = age;
        }else {this.age = 1;}
        if (weight > 0){
            this.weight = weight;
        }else { this.weight = 1;}

        public String getName() {
            return name;
        }

        public double getHeight() {
            return height;
        }

        public int getAge() {
            return age;
        }

        public double getWeight() {
            return weight;
        }
       // public void compare (){

       // }
    }
}
