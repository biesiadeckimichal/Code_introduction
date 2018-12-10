package methods;

public class Case1 {
    // f(x) = x2 + 2x - 5
    public static int wyliczWartoscFunkcji(int x){
        int wynik = x * x + 2 * x - 5;
        return wynik;
    }

    public static int dodaj(int a, int b) {
        int wynik = a + b;
        return wynik;
    }

    public static void main(String[] args) {
        System.out.println(wyliczWartoscFunkcji(0));
        System.out.println(dodaj(4, 5));

    }
}

