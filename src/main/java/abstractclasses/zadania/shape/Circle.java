package abstractclasses.zadania.shape;

public class Circle extends Shape {
    private int r;

    public Circle(String color, int r) {
        super(color);
        this.r = r;
    }

    public int getPerimeter() {
        return 2 * r * 314/100;
    }

    public int getArea() {
        return r * r * 314/100;
    }
}
