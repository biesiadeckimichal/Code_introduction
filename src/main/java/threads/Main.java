package threads;

import javafx.scene.paint.Stop;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main start");
        // korzystamy z interfacu runnable ktory mial tylko jedna metode abstrakcyjna
        // wiec mozemy skorzystac z lambdy
        // jako ze metoda w runnable nie przyjmuje argumentu zostawiamy puste nawiasy
        // w lambdzie uzywamy nawiasow wasatych gdy chcemy zeby wykonywala wiecej niz
        // jedna instrukcje
        // I sposob na tworzenie nowego watku, uzywamy lambdy


//        Thread thread = new Thread(() -> {
//            System.out.println("Start nowego watku");
//            for (int i = 0; i < 5; i++) {
//                System.out.println(i);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        // ustawiamy tu ze kiedy uruchomimy glowny watek, glowny watek nie musi czekac
//        // na watek poboczny
//        thread.setDaemon(true);
//        thread.start();

        StopWatchThread stopWatchThread1 = new StopWatchThread(10, "sw1");
        StopWatchThread stopWatchThread2 = new StopWatchThread(10, "sw2");

        stopWatchThread1.start();
        stopWatchThread2.start();


        Thread.sleep(3000);
        System.out.println("main koniec");
    }
}
