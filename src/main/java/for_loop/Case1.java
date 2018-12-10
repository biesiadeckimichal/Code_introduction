package for_loop;

import java.util.Scanner;

public class Case1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("podaj pierwsza liczbę: ");
        int x = input.nextInt();
        System.out.print("podaj drugą liczbę: ");
        int y = input.nextInt();

        for (int i = x; i < y + 1; i++) {
            System.out.print(i + " ");
        }
    }
}
