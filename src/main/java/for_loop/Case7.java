package for_loop;

public class Case7 {
    public static void main(String[] args) {
        int wyraz = 3;
        int suma = 0;
        for (int i = 1; i <= 459; i++) {
            wyraz = wyraz + 2;
            suma = suma + wyraz;
            System.out.println("wyraz: " + wyraz);
        }
        System.out.println("suma: " + suma);
    }
}
