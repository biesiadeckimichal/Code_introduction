package classes.zadania.polygons;

public class Rectangle {
    int a;
    int b;

    Rectangle (){}

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int getArea() {
        return a * b;
    }

    int getPerimeter() {
        return 2 * a + 2 * b;
    }
}
