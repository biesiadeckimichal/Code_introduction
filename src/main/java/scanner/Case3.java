package scanner;

import java.util.Scanner;

public class Case3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("podaj figurę (kwadrat, prostokąt, trójkąt): ");
        String figura = input.next();

        System.out.print("podaj a: ");
        int a = input.nextInt();

        System.out.print("podaj b: ");
        int b = input.nextInt();

        switch(figura) {
            case "kwadrat":
                System.out.println("pole " + figura + " to: " + a*a);
                break;
            case "prostokąt":
                System.out.println("pole " + figura + " to: " + a*a);
                break;
            case "trójkąt":
                System.out.println("pole " + figura + " to: " + a*a);
                break;
            default:
                System.out.println("błedna figura");
        }
    }
}
