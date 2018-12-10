package wardrobe;

import java.util.Scanner;

// Klasa reprezentuje interfejs użytkownika na potrzeby obsługi obiektu typu powtorka.
public class WardrobeUI {
    // do pola będzie przypisany scanner, którego będziemy używali do odczytywania wartości z konsoli
    private Scanner scanner;
    // do pola będzie przypisana szafa, którą będziemy zarządzali
    private Wardrobe wardrobe;

    // Tworząc nowy obiekt typu WardrobeUI
    public WardrobeUI() {
        // ustawimy wartości pól:
        // scanner to będzie nowy obiekt typu Scanner
        scanner = new Scanner(System.in);
        // polu powtorka przypiszemy pustą szafę.
        wardrobe = new Wardrobe();
    }

    // Metoda uruchamia interfejs
    public void run() {
        // Pytamy użytkownik o komendę
        System.out.println("Podaj komendę (dodaj tshirt, " +
                "dodaj spodnie, dodaj skarpetki, usun, wypisz)");
        // i zaczytujem ją z konsoli
        String command = scanner.nextLine();
        // dopóki nie poda zakoncz, działamy
        while (!command.equals("zakoncz")) {
            // w zależności od tego, co podał
            switch (command) {
                // dodajemy tshirt
                case "dodaj tshirt":
                    addTShirt();
                    break;
                // albo spodnie
                case "dodaj spodnie":
                    addTrousers();
                    break;
                // albo skarpetki
                case "dodaj skarpetki":
                    addSocks();
                    break;
                // albo usuwamy ubranie
                case "usun":
                    remove();
                    break;
                // albo wypisujemy zawartość szafy1
                case "wypisz":
                    print();

            }
            System.out.println("Podaj komendę (dodaj tshirt, dodaj spodnie, dodaj skarpetki, usun, wypisz)");
            command = scanner.nextLine();
        }
    }

    // metoda dodaje tshirt
    private void addTShirt() {
        System.out.println("Dodawanie t-shirtu:");
        // wypytujemy użytkownika o parametry tshitru
        System.out.println("Podaj rozmiar (wartość z przedziału 1-5");
        int size = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj materiał:");
        String fabric = scanner.nextLine();
        System.out.println("Czy posiada rękawy (tak/nie):");
        String noSleevesText = scanner.nextLine();
        boolean noSleeves = noSleevesText.equals("tak");
        // tworzymy tshirt zgodnie z odpowiedziami
        TShirt tshirt = new TShirt(size, fabric, noSleeves);
        // i dodajemy do szafy
        wardrobe.add(tshirt);
    }

    // analogicznie jak tshirt
    private void addTrousers() {
        System.out.println("Dodawanie spodni:");
        System.out.println("Podaj rozmiar (wartość z przedziału 1-5");
        int size = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj materiał:");
        String fabric = scanner.nextLine();
        System.out.println("Czy to spodnie jeansowe (tak/nie):");
        String jeansText = scanner.nextLine();
        boolean jeans = jeansText.equals("tak");
        Trousers trousers = new Trousers(size, fabric, jeans);
        wardrobe.add(trousers);
    }

    // analogicznie jak tshirt
    private void addSocks() {
        System.out.println("Dodawanie skarpetek:");
        System.out.println("Podaj rozmiar (wartość z przedziału 1-5");
        int size = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj materiał:");
        String fabric = scanner.nextLine();
        System.out.println("Czy wysokie (tak/nie):");
        String highText = scanner.nextLine();
        boolean high = highText.equals("tak");
        Socks socks = new Socks(size, fabric, high);
        wardrobe.add(socks);
    }

    // metoda usuwa z szafy element zgodnie z wyborem uzytownika
    private void remove() {
        // wypiszemy ubrania z szafy
        print();
        System.out.println("Ktore ubranie usunąć? Podaj numer");
        // uzytkownik podaje numer ubrania (ubranie numer 1 ma index 0, wiec odejmujemy 1)
        int index = scanner.nextInt() - 1;
        scanner.nextLine();
        // wybierzemy z szafy usuwane ubranie
        Clothing clothing = wardrobe.get(index);
        // usuwamy ubranie
        wardrobe.remove(index);
        // wypiszemy informację o usuniętym ubraniu
        System.out.println("Usunięto: " + clothing);
    }

    // Wypiszemy zawartość szafy
    private void print() {
        System.out.println("Wypisuję ubrania z szafy:");
        wardrobe.print();
    }
}
