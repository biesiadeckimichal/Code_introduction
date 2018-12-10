package for_loop;

import java.util.Scanner;

public class Case6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("podaj liczbę początkową(1): ");
        int x = input.nextInt();
        System.out.print("podaj liczbę końcową(459): ");
        int y = input.nextInt();

        for (int i = x; i <= y; i++) {
            int suma = 0;
            suma = suma + i;
            System.out.println("suma: " + suma);
        }
    }
}
