package tables;

public class Intro {
    public static void main(String[] args) {
        // najpierw ustalamy typ danych tablicy, nastepnie jej nazwe
        int[] intArray = {3, 4, 5, 6, 6};

        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);
        System.out.println(intArray[3]);
        System.out.println(intArray[4]);
        System.out.println("liczba elementow tablicy: " + intArray.length);
        // tu mamy void bo tablica nic nie zwraca
        // brak "return", tylko drukujemy
    }

    public static void printLastElement ( int[] intArray){
        System.out.println(intArray[intArray.length - 1]);
    }

    // tu mamy int bo tablica zwraca nam ostatni element
    public static int printLastElement1 ( int[] intArray2){
        return intArray2[intArray2.length - 1];
    }
}
