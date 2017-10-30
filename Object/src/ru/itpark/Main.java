package ru.itpark;

import com.sun.org.apache.regexp.internal.RE;

public class Main {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
	    Rectangle rectangle1 = new Rectangle(2,4);
        Rectangle rectangle2 = new Rectangle(4,7);
        Rectangle rectangle3 = new Rectangle(2,4);
        Rectangle rectangle4 = new Rectangle(14,17);

        Circle circle1 = new Circle(7);
        Circle circle2 = new Circle(2);
        Circle circle3 = new Circle(7);
        Circle circle4 = new Circle(9);
        list.add(rectangle1);
        list.add(rectangle2);
        list.add(rectangle3);
        list.add(rectangle4);
        list.add(circle1);
        list.add(circle2);
        list.add(circle3);
        list.add(circle4);


        System.out.println(list.find(circle2));

    }
}
