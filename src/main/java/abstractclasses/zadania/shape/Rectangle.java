package abstractclasses.zadania.shape;

public class Rectangle extends Shape {
    private int a;
    private int b;

    public Rectangle(String color, int a, int b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public int getPerimeter() {
        return 2 * a + 2 * b;
    }

    @Override
    public int getArea() {
        return a * b;
    }
}
