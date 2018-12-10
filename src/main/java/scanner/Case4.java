package scanner;

import java.util.Scanner;

public class Case4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.println("podaj liczbe: ");
        int x = 4;

        int czyPodzielnaPrzezWszystko = 0;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                czyPodzielnaPrzezWszystko = 1;
            } else {
                czyPodzielnaPrzezWszystko = 0;
            }
        }
        if (czyPodzielnaPrzezWszystko == 1) {
            System.out.println(x + " nie jest liczbą pierwszą");
        } else {
            System.out.println(x + " jest liczbą pierwszą");
        }
    }
}
