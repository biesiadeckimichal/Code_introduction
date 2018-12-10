package exceptions.zadania;

public class zadanie1 {
    public static void main(String[] args) {
        System.out.println(divide(4,0));
        System.out.println();

        int[] intList = {4, 0, 4};
        System.out.println(divideTwoArrayElements(intList, 0,1));
        }

    public static Integer divide(int x, int y) {
        Integer wynik;
        try {
            wynik = x / y;
        } catch (Exception e) {
            System.out.println("dzielnik jest rowny 0");
            wynik = null;
        }
        return wynik;
    }

    public static int divideTwoArrayElements(int[] intList, int index1, int index2) {
        Integer wynik;
        try {
            wynik = intList[index1] / intList[index2];
            // mozemy uzyc Arithmeticexception, exception albo throwable
        } catch (Exception e) {
            System.out.println("w tablicy jest dzielenie przez 0");
            wynik = null;
        }
        return wynik;
    }
}
