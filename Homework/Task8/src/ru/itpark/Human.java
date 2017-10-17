package ru.itpark;

public class Human  {
    private String name;
    protected int height;
    protected int age;
    protected int weight;



    public Human(String name, int height, int age, int weight) {
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


    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
