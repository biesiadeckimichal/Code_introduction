package tables;

public class Case1 {
    public static void main(String[] args) {
        int[] intArray = {3, 5, 5};
        print(intArray);
    }

    // metoda z typem danych void, oznacza ze ta metoda nic nie zwraca
// czyli nie wymaga opcji return, funkcja po prostu wykonuje jakas operacje
// i przechowuje jej wynik
    public static void print(int[] someArray) {
        for (int i = 0; i < someArray.length; i++) {
            System.out.println(someArray[i]);
        }
    }
}
