package c_for_loop;

import java.util.Scanner;

public class Case4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("podaj liczbę początkową(0): ");
        int x = input.nextInt();
        System.out.print("podaj liczbę końcową(100): ");
        int y = input.nextInt();

        for (int i = x; i < y + 1; i++) {
             if (i % 2 == 0 && i != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
