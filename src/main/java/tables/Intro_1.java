package tables;

public class Intro_1 {
    public static void main(String[] args) {
        int[] intArray = {3, 4, 5, 6};
        int[] intArray2 = new int[1000];

        System.out.println(printLastElement1(intArray));

    }

    // tu mamy void bo tablica nic nie zwraca
    // brak "return", tylko drukujemy
    public static void printLastElement(int[] intArray) {
        System.out.println(intArray[intArray.length - 1]);
    }

    // tu mamy int bo tablica zwraca nam ostatni element
    public static int printLastElement1(int[] intArray) {
        return intArray[intArray.length - 1];
    }
}
