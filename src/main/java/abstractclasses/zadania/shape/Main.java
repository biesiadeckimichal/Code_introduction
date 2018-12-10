package abstractclasses.zadania.shape;

public class Main {
    public static void main(String[] args) {
        Shape kolo = new Circle("czerwony", 4);
        Rectangle kwadrat = new Square("niebieski", 4,4);

        Solid stozek = new Cone(5, 5, 7);
        Solid walec = new Cylinder(4, 2);
        PerpendicularSolid prostopadloscian = new PerpendicularSolid(kwadrat, 5);

        System.out.println(stozek.getSurfaceArea());
        System.out.println(stozek.getVolume());
        System.out.println();
        System.out.println(prostopadloscian.getVolume());
        System.out.println(prostopadloscian.getSurfaceArea());
    }
}
