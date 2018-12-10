package inheritance;

public class Main {
    public static void main(String[] args) {
        Animal canisLupus = new Animal("canis lupus",4,false,100);
        Horse horse1 = new Horse("kon", 4,false,200,50, true);
        Horse horse2 = new Horse("kon", 4,false,400,50, true);
        Horse horse3 = new Horse("kon", 4,false,500,50, true);

        Animal[] animals = {horse1, horse2, horse3};

        System.out.println(horse1.getLimbCount());

        Animal animal = horse1;

        System.out.println(animal.toString());

        System.out.println();

        System.out.println("Najcięższe zwierze to: ");
        System.out.println(Animal.getHeaviest(animals));

    }
}
