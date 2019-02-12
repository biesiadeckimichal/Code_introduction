package g_methods;

public class Intro {
    // metoda i funkcja to to samo
    // metoda jest punktem startowym naszej aplikacji
    public static void main(String[] args) {
        System.out.println(wyliczWartoscNaszejFunkcjiKwadratowej(0));
        System.out.println(wyliczWartoscNaszejFunkcjiKwadratowej(3));
        System.out.println(wyliczWartoscNaszejFunkcjiKwadratowej(2));
        System.out.println(wyliczWartoscNaszejFunkcjiKwadratowej(1));

        int fOd0 = wyliczWartoscNaszejFunkcjiKwadratowej(0);

        int parametr1 = 5;
        System.out.println(wyliczWartoscNaszejFunkcjiKwadratowej(parametr1));

        System.out.println(dodaj(5, 6));

    }
    // f(x) = x2 + 2x - 5
    // f(0) = 0 + 0 - 5, czyli mamy funkcje od 0 rowna -5
    // typ danych zwracanych przez funkcje to int
    // kolejna dana to nazwa, stosuje sie zasade ze pierwsze slowo to czasownik
    // w nawiasie (int x) typ danych przyjmowanych przez funkcje
    // cammel case
    // nasz parametr typu int nazywamy x

    public static int wyliczWartoscNaszejFunkcjiKwadratowej(int x) {
        int wynik = x * x + 2 * x - 5;
        return wynik;
    }

    public static int dodaj(int a, int b) {
        return a + b;
    }
}
