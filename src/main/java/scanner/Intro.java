package scanner;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args){
        // deklaruje zmienna myScanner typu Scanner, przypisujemy obiekt przez new
        Scanner myScanner = new Scanner(System.in);
        String text = myScanner.nextLine();
        System.out.println("podano tekst: " + text);
    }
}
