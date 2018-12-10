package classes.zadania.house;

import classes.zadania.polygons.Circle;
import classes.zadania.party.Person;
import classes.zadania.polygons.Rectangle;
import classes.zadania.polygons.Triangle;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Room room1 = new Room(4, 5);
        Room room2 = new Room(5, 5);
        Room kitchen = new Room(3,3);
        Room bathroom = new Room(2,4);
        Room[] rooms = {room1, room2};
        House house = new House("ul. Nowa", kitchen, bathroom, rooms);

        System.out.println("area: " + room1.area);
        System.out.println("height: " + room1.height);
        System.out.println("area: " + room2.area);
        System.out.println("height: " + room2.height);
        System.out.println("pole room1: " + room1.countSquare());
        System.out.println("pole: " + house.getArea());
    }
}
