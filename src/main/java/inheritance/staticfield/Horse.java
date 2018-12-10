package inheritance.staticfield;

public class Horse {
    private int maneLength;
    private int weight;
    private String name;

    // pola statyczne tyczą się całej klasy Horse. To znaczy, że nie będzie tak, jak przypadku niestatycznych pól
    // że każdy obiekt typu Horse (każdy konkretny koń) będzie miał z osobna pole count. Pole count jest jedno
    // i tyczy się wszystkich koni (będziemy mówić, że tyczy się całej klasy Horse)
    // w polu count zliczamy utworzone obiekty typu horse.
    private static int count;
    // w polu combinedManeLength zliczamy łączną dlugość grzyw wszystkich koni.
    private static int combinedManeLength;

    public Horse(int maneLength, int weight, String name) {
        this.maneLength = maneLength;
        this.weight = weight;
        this.name = name;

        // W metodzie niestatycznej (a taką jest konstruktor) możemy bez problemu odwołać się do pola statycznego -
        // w końcu jasne jest, o które pole chodzi - to jedne jedyne, które przypisane jest do wszystkich koni.
        // zwiększamy łączną długość grzyw wszystkich koni o długość grzywy tworzonego konia.
        combinedManeLength += maneLength;
        // zwiększamy liczbę tworzonych koni o jeden.
        count++;
    }

    // w metodzie statycznej możemy się odwołać tylko do pól i metod statycznych
    public static int getCount() {
        return count;
    }

    public static int getCombinedManeLength() {
        return combinedManeLength;
    }
}