package abstractclasses.powtorka.shape;

public class Rectangle extends Shape {
    private int a;
    private int b;

    public Rectangle (String color, int a, int b) {
        super(color);
        this.a = a;
        this.a = b;
    }

    public int getArea() {
        return a * b;
    }

    public int getPerimeter() {
        return 2 * a * b;
    }
}
