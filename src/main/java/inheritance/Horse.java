package inheritance;

// extends oznacza ze Horse dziedziczy od Animal
public class Horse extends Animal {
    private int maneLength;
    // podkuty
    private boolean shod;

    public Horse (String specie, int limbCount, boolean dead, int weight, int maneLength, boolean shod) {
        // super oznacza ze tymi polami ma sie zajac konstruktor z klasy animal
        // a my sie zajmiemy tym co teraz
        // Mamy dostęp do pola limbCount z klasy Animal dlatego, że tamto pole ma modyfikator dostępu protected.
        // Ten modyfikator zezwala na dostęp wszystkim klasom z tego samego pakietu oraz wszystkim klasą, które
        // rozszerzają tę, z polem z tym modyfikatorem.
        super(specie, limbCount, dead, weight);
        this.maneLength = maneLength;
        this.shod = shod;
    }

    public Horse(int maneLength, boolean shod) {
        super("kon", 4, false, 300);
        this.maneLength = maneLength;
        this.shod = shod;
    }

    public int getManeLength() {
        return maneLength;
    }

    public boolean isShod() {
        return shod;
    }

    public void shoe() {
        limbCount--;
    }

    public String toString() {
        return super.toString() + "podkuty: " + shod + ", dlugosc grzywy: " + maneLength;
    }
}
