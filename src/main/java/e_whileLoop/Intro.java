package e_whileLoop;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        // deklaracja zmiennej to zawsze pisanie pary! typ + nazwa
        Scanner myScanner = new Scanner(System.in);
        int x = 0;
        while (x <= 1000) {
            System.out.println("aktualna wartosc x: " + x);
            System.out.println("podaj o ile zwiekszyc wartosc:");
            int diff = myScanner.nextInt();
            x += diff;
        }
        System.out.println("x przekroczyl 1000, jego wartosc to: " + x);
    }
}

