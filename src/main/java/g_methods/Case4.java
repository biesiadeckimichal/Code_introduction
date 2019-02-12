package g_methods;

public class Case4 {
    public static void main(String[] args) {
        int x = 4;
        int y = 3;
        System.out.println(power(x,y));
    }

    public static int power(int podstawa, int potega) {
        int wynik = 1;
        for (int i = 0; i < potega; i++) {
            wynik *= podstawa;
        }
        return  wynik;
    }
}
