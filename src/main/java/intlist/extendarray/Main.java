package intlist.extendarray;

public class Main {
    public static void main(String[] args) {
        // obiekt typu int[] (prawa strona) przypisuje obiektowi typu int[] (lewa strona)
        int[] intArray = new int[3];
        intArray[0] = 5;
        intArray[1] = 3;
        intArray[2] = 7;

        int[] extendedArray = extendArray(intArray, 10);

        // int[] extendedArray = new int[intArray.length + 1];
        // for (int i = 0; i < intArray.length; i++) {
        // extendedArray[i] = intArray[i];
        // }
        // extendedArray[intArray.length] = 10;

        print(extendedArray);
    }

        // jesli tablica modfikowalaby dane w tablicy to nic by nie zwracala
        // a wiec bylby void, bo juz otrzymalibysmy dane tablicy, tylko bysmy je zmieniali
        // a nie tworzyli nowe
        //

    public static int[] extendArray(int[] intArray, int newElement) {
        // tworze nowa tablice o 1 wieksza
        int[] extendedArray = new int[intArray.length + 1];
        // przepisuje wartosci z I tablicy
        for (int i = 0; i < intArray.length; i++) {
            extendedArray[i] = intArray[i];
        }
        // przypisuje ostatniemu elementowi tablicy nowa dana
        extendedArray[intArray.length] = newElement;

        // zwracam nowa tablice
        return extendedArray;
    }

    public static void print(int[] intArray) {
        // for (int i = 0; i < intArray.length; i++) {
        // System.out.println(intArray[i]);
        // }

        // petla nazywa sie for each
        // int rodzaj kazdego kolejnego elementu danej tablicy
        for (int element : intArray) { // wypisujemy elementy przez ktore chcemy przebiec
            System.out.println(element);
        }
    }
}