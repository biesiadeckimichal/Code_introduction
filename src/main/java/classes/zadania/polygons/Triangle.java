package classes.zadania.polygons;

public class Triangle {
    int a;
    int b;
    int c;
    int h;

    Triangle(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    double getArea() {
        return 0.5 * a * h;
    }

    int getPerimeter() {
        return a + b + c;
    }

}
