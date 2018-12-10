package classes.zadania.polygons;

import classes.zadania.house.House;
import classes.zadania.house.Room;
import classes.zadania.party.Person;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);

        System.out.println("pole kwadrata: " + rectangle.getArea());
        System.out.println("obwód kwadrata: " + rectangle.getPerimeter());

        System.out.println();

        Triangle triangle = new Triangle(3, 4, 5, 6);
        System.out.println("pole trójkąta: " + triangle.getArea());
        System.out.println("obwód trójkąta: " + triangle.getPerimeter());

        System.out.println();

        Circle circle = new Circle(3);
        System.out.println("pole koła: " + circle.getArea());
        System.out.println("obwód koła: " + circle.getPerimeter());

        System.out.println();
    }
}
