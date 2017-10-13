package ru.itpark;

public class Main {

    public static void main(String[] args) {
	Triangle triangle = new Triangle();
	triangle.perimeter(3,4,5);
	triangle.area(3,4,5);
        System.out.println("Периметр треугольника = "+ triangle.getP());
        System.out.println("Площадь треугольника = " + triangle.getS());
	Square square = new Square(4);
	square.perimeter(4);
	square.area(4);
        System.out.println("Периметр квадрата = "+ square.getP());
        System.out.println("Площадь квадрата = "+ square.getS());

	Rectangle rectangle = new Rectangle(5,6);
	rectangle.perimeter(5,6);
	rectangle.area(5,6);
        System.out.println("Периметр прямоугольника = "+ rectangle.getP());
        System.out.println("Площадь прямоугольника"+ rectangle.getS());

	Circle circle = new Circle(5);
	circle.perimeter(5);
	circle.area(5);
        System.out.println("Периметр окружности = " + circle.getP());
        System.out.println("Площадь окружности ="+ circle.getS());

    Ellipse ellipse = new Ellipse(5,2,3);
    ellipse.perimeter(5,2,3);
    ellipse.area(2,3);
        System.out.println("Периметр эллипса = "+ ellipse.getP());
        System.out.println("Площадь эллипса = "+ ellipse.getS());



    }
}
