package chat.powtórka;

import java.util.Scanner;

public class Case7 {
    public static void main(String[] args) {
        String text = "aaabcde";
        Scanner input = new Scanner(System.in);
        System.out.println("podaj literę: ");
        int letter = input.next().charAt(0);
        int occ = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == letter) {
                occ += 1;
            }
        }
        System.out.println(occ);
    }


}
