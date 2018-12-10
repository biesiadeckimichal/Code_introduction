package abstractclasses.powtorka.shape;

public class Circle extends Shape {
    private int r;

    public Circle(String color, int r) {
        super(color);
        this.r = r;
    }

    @Override
    public int getArea() {
        return r * r * 314/100;
    }

    @Override
    public int getPerimeter() {
        return r * 2 * 314/100;
    }
}
