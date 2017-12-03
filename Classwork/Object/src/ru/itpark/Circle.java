package ru.itpark;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void setRadius(int radius) {
        if(radius < 0){
            this.radius = 1;
        }else {
            this.radius = radius;
        }

    }
    public boolean equals(Object object) {
        if ( object == null || !(object instanceof Circle)) {
            return false;
        }

        if (this == object) {
            return true;
        }

        Circle that = (Circle) object;
        return this.radius == that.radius;
    }
}
