package inheritance.staticfield;

public class Main {
    public static void main(String[] args) {
        // Do statycznych pól i metod odwołujemy się za pomocą klasy. Wywołamy metodę getCount
        // mówiącą nam o tym ile koni utworzyliśmy (ile utworzyliśmy instancji klasy Horse)
        System.out.println(Horse.getCount());
        Horse horse1 = new Horse(50, 900, "Kasztanka");

        Horse horse2 = new Horse(60, 850, "Płotka");
        // wywołamy metodę jeszcze raz po utworzeniu dwóch obiektów typu Horse.
        System.out.println(Horse.getCount());
    }
}