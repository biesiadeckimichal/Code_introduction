package abstractclasses.powtorka.shape;

public abstract class Shape {
    private String color;

    public abstract int getArea();
    public abstract int getPerimeter();

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}
