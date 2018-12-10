package classes.zadania.polygons;

public class Circle {
    int r;

    // konstruktor
    Circle(int r) {
        this.r = r;
    }

    double getArea() {
        return 3.14 * r * r;
    }

    double getPerimeter() {
        return 2 * 3.14 * r;
    }

}
