package for_loop.powtórka;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("podaj liczbe iteracji: ");
        int numberOfIterations = input.nextInt();
        int t1 = 0;
        int t2 = 1;
        while (t1 <= numberOfIterations) {
            System.out.print(t1 + " ");
            int sum;
            sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }

    }
}
