package wardrobe.powtorka;

import java.util.Scanner;

public class WardrobeUI {
    private Scanner scanner;
    private Wardrobe wardrobe;

    public WardrobeUI() {
        scanner = new Scanner(System.in);
        wardrobe = new Wardrobe();
    }

    public void run() {
        System.out.println("Podaj komende (dodaj, wypisz, zakoncz)");
        String command = scanner.nextLine();
        while (!command.equals("zakoncz")) {
            if (command.equals("dodaj")) {
                System.out.println("Co dodac? (tshirt, socks, trousers)");
                command = scanner.nextLine();
                switch (command) {
                    case "tshirt":
                        addTShirt();
                        break;
                    case "socks":
                        addSocks();
                        break;
                    case "trousers":
                        addTrousers();
                        break;
                }
            } else {
                switch (command) {
                    case "wypisz":
                        break;
                }
            }
            command = scanner.nextLine();
            System.out.println("Podaj komende (dodaj, wypisz, zakoncz)");
        }
    }

    // TShirt koszulka = new TShirt(10, "bawelna", false);
    // Socks skarpetki = new Socks(8, "bawełna", "czerwony");
    // Trousers spodnie = new Trousers(10, "jeans", "joggery");

    private void addTShirt() {
        System.out.println("Dodawanie TShirtu");
        System.out.println("Rozmiar (1 - 5)");
        int size = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Material");
        String fabric = scanner.nextLine();
        System.out.println("Czy ma rękawy (tak/nie");
        String sleevless = scanner.nextLine();
        boolean yesSleevless = sleevless.equals("nie");
        TShirt tshirt = new TShirt(size, fabric, yesSleevless);
        wardrobe.add(tshirt);
    }

    private void addSocks() {
        System.out.println("Dodawanie skarpet");
        System.out.println("Rozmiar (1 - 5)");
        int size = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Materiał");
        String fabric = scanner.nextLine();
        System.out.println("Kolor");
        String color = scanner.nextLine();
        Socks socks = new Socks(size, fabric, color);
        wardrobe.add(socks);
    }

    private void addTrousers() {
        System.out.println("Dodawanie spodni");
        System.out.println("Rozmiar (1 - 5)");
        int size = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Materiał");
        String fabric = scanner.nextLine();
        System.out.println("Typ");
        String type = scanner.nextLine();
        Trousers trousers = new Trousers(size, fabric, type);
    }


}
