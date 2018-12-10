package staticField;

public class Main {
    public static void main(String[] args) {
        System.out.println(Horse.getCount());
        Horse horse1 = new Horse(50, 900, "Kasztanka");
        System.out.println(Horse.getCount());
        Horse horse2 = new Horse(60, 850, "Płotka");
        System.out.println(Horse.getCount());
    }
}
