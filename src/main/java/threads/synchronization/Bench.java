package pl.sdacademy.datetime.Maven.threads.src.main.java.pl.sdacademy.threads.synchronization;

public class Bench {
    private int availableSeats;

    public Bench(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    // synchronized sprawia ze tylko jeden watek moze uruchomic metode obiektu ktora
    // jest synchronizowana
    public synchronized void takeAseat(String name) {
        if (availableSeats > 0) {
            System.out.println(name + " siadam");
            availableSeats--;
            System.out.println("zostalo " + availableSeats
                + " wolnych miejsc");
        } else {
            System.out.println("nie ma miejsca dla " + name);
        }
    }
}
