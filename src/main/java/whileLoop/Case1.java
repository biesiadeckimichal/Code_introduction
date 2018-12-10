package whileLoop;

import java.util.Scanner;

public class Case1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("zakończyc?: ");
        String answer = input.next();

        while (!answer.equals("tak")) {
            System.out.print("a teraz?: ");
            answer = input.next();
        }
        System.out.print("zakonczono");
    }

}
