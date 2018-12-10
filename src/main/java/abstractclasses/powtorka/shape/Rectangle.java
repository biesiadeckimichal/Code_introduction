package abstractclasses.powtorka.shape;

public class Rectangle extends Shape{
    private int a;
    private int b;

    public Rectangle(String color, int a, int b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public int getArea() {
        return a * b;
    }

    @Override
    public int getPerimeter() {
        return 2 * a + 2 * b;
    }

}
