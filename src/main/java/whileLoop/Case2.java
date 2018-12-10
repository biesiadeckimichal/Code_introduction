package whileLoop;

import java.util.Scanner;

public class Case2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("podaj wartosc liczbowa: ");
        int x = input.nextInt();

        int powerOf3 = 1;
        int exponent = 0;

        while (powerOf3 <= x) {
            exponent++;
            powerOf3 *= 3;
        }
        System.out.println("odpowiedz to: " + exponent + " poniewaz 3 do potegi " + exponent + " wynosi: " + powerOf3 + ", a wiec jest wieksze od " + x);
    }
}
