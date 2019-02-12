package d_scanner;

import java.util.Scanner;

public class Case1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("podaj liczbę: ");
        int x = input.nextInt();
        for (int i = 0; i < x + 1; i++) {
            System.out.print(i + " ");
        }
    }
}
