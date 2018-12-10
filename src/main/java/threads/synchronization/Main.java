package pl.sdacademy.datetime.Maven.threads.src.main.java.pl.sdacademy.threads.synchronization;

public class Main {
    public static void main(String[] args) {
        Bench bench = new Bench(1);
        BenchSeatTaker darek = new BenchSeatTaker("Darek", bench);
        BenchSeatTaker stefan = new BenchSeatTaker("Stefan", bench);

        // metoda start wywoluje metode run z automatu
        darek.start();
        stefan.start();

    }
}
