package for_loop;

import java.util.Scanner;

public class Case5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("podaj liczbę początkową(0): ");
        int x = input.nextInt();
        System.out.print("podaj liczbę końcową(100): ");
        int y = input.nextInt();

        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                if (i % 3 == 0) {
                    if (i % 5 ==0) {
                        System.out.println(i + " / przez 2, 3, 5");
                    }
                    else {
                        System.out.println(i + " / przez 2, 3");
                    }
                } else if (i % 5 == 0){
                    System.out.println(i + " / przez 2, 5");
                } else {
                    System.out.println(i + " / przez 2");
                }
            } else if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.println(i + " / przez 3, 5");
                } else {
                    System.out.println(i + " / przez 3");
                }
            } else if (i % 5 == 0) {
                System.out.println(i + " / przez 5");
            }
        }
    }
}
