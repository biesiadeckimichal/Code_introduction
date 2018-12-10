package for_loop;

import java.util.Scanner;

public class Case3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("podaj liczbę początkową(100): ");
        int x = input.nextInt();
        System.out.print("podaj liczbę końcową(1): ");
        int y = input.nextInt();

        for (int i = x; i >= y; i-- ) {
            if (i == 50) {
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
