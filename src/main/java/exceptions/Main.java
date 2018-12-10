package exceptions;

public class Main {
    public static void main(String[] args) throws Exception {
        // wyjatki to bledy wyrzucane w momencie erroru
        // np proba wywolania metody na nullu, czyli na niczym, nie da sie
        // metoda sluzaca do wylapywania wyjatkow
        // parametr e oznacza exceptions taka jest zasada
        // wyjatek error to wyjatek po stronie maszyny ktora korzysta z programu
        // wyjatek exception to wyjatek po stronie programu
        // mamy dziedziczenie miedzy wyjatkami, np nullpointer exception dziedziczy
        // po runtimexceptionie, wiec moge pisac je zamiennie
        // throwable jest na szczycie wyjatkow
        // do rozdzielenia w catch stosujemy |
        Object myObject = "abc";
        int[] intArray = new int[5];
        int x = 5, y = 0;
        int z;
        try {
            z =  x / y;
            myObject.toString();
            System.out.println(intArray[25]);
            System.out.println("Kod po wyrzuceniu wyjatku " +
                    "czyli co by bylo gdyby bledu nie bylo");
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Obsługuję NullPointerExceptions " +
                    "lub ArrayIndexOutOfBoundsException");
        } catch (ArithmeticException e) {
            System.out.println("Obsluguje ArithmeticException");
            // finally jest jedyna instrukca ktora mozna wywolac po return,
            // ktore mogloby znalezc sie gdzies wczesniej
            // druga wazna rzecz to fakt ze czesc try zostaje domknieta, mamy pewnosc
            // ze tak sie stanie
        } finally {
            System.out.println("Kod wywolywany niezaleznie od tego, czy zostal " +
                    "wyrzucony wyjate, czy nie (nawet gdy zostala wywolana instrukcja " +
                    "return");
        }
        System.out.println("Aplikacja dziala dalej");


        try {
            performOperation("operacja3");
        } catch (Exception e) {
            System.out.println("Wyrzucony wyjatek: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // throws jest drugim sposobem zajmowania sie wyjatkiem
    // throws powoduje przekazanie wyjatku pietro wyzej, do metody ktora jest wyzej
    private static void performOperation(String operationName) throws Exception {
        switch (operationName) {
            case "operacja1":
            case "operacja2":
                System.out.println("przeprowadzam operacje " + operationName);
                break;
            default:
                throw new RuntimeException("Podano nieprawidlowy argument");
        }
    }
}
