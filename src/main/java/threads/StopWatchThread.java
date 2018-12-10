package threads;

public class StopWatchThread extends Thread {
    private int limit;
    private String prefix;

    public StopWatchThread(int limit, String prefix) {
        this.limit = limit;
        this.prefix = prefix;
    }

    // II sposob na utworzenie nowego watku
    @Override
    public void run() {
        System.out.println(prefix + " start!");
        for (int i = 1; i < limit; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(prefix + " " + i);
        }
        System.out.println(prefix + " koniec!");
    }
}
