package abstractclasses.powtorka.shape;

public class Main {
    public static void main(String[] args) {
        Shape myShape = new Rectangle("czarny", 2,2);
        System.out.println("kwadrat: " + myShape.getColor());
        printAreaAndPerimeter(myShape);

        myShape = new Circle("biały", 4);
        System.out.println("koło: " + myShape.getColor());
        printAreaAndPerimeter(myShape);
    }

    private static void printAreaAndPerimeter(Shape shape) {
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
    }
}
