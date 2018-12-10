package exceptions.person;
// cos jest nie tak
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek tworzonej osoby: ");
        int age = scanner.nextInt();
        // przez to ze w klasie person zadeklarowalismy obsluge wyjatku
        // musimy ten wyjatek teraz obsluzyc, nie moge stworzyc obiektu bez try
        try {
            new Person(age);
        // e jest tylko nazwa zmiennej mozemy wpisac cokolowiek
        } catch (IncorrectAgeException e) {
            System.out.println("Zlapalem wyjatek: " + e.getMessage());
            System.out.println("Próbowano tworzyć osobę o wieku: " + e.getAge());
        }
    }
}
