package d_scanner;

import java.util.Scanner;

public class Case2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("podaj a: ");
        int a = input.nextInt();
        System.out.print("podaj b: ");
        int b = input.nextInt();
        System.out.print("pole to: " + a*b);
    }
}
