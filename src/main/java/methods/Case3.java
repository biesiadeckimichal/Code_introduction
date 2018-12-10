package methods;

public class Case3 {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        System.out.println(multiply(x,y));
    }

    public static int multiply(int liczba, int mnoznik) {
        int wynik = 0;
        for (int i = 0; i < mnoznik; i++){
            wynik += liczba;
        }
        return wynik;
    }
}
