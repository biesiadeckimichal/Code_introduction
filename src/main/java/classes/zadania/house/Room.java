package classes.zadania.house;

public class Room {
    int area;
    int height;

    // konstruktor

    Room(int area, int height) {
        this.area = area;
        this.height = height;
    }

    public int countSquare() {
        return area * area;
    }
}
