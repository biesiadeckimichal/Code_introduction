package pl.sdacademy.datetime.Maven.threads.src.main.java.pl.sdacademy.threads.synchronization;

// extends Thread oznacza ze ta klasa bedzie watkiem
public class BenchSeatTaker extends Thread {
    private String name;
    private Bench bench;

    public BenchSeatTaker(String name, Bench bench) {
        this.name = name;
        this.bench = bench;
    }

    // metoda start wywoluje metode run z automatu
    @Override
    public void run() {
        bench.takeAseat(name);
    }

//    int x = 5;
//    String slowkoOx = x > 0 ? "x jest dodatni" : "x nie jest dodatni";
//    podobnie jak jezeli w excelu
}
