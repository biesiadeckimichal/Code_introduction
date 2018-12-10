package logicalOperators;

public class Main {
    public static void main(String[] args) {
        int x = 8, y = 4, z = 5;

        // Sprawdzimy, czy x jest największą ze zmiennych x, y, z.
        // Skorzystamy z operatora logicznego && (oraz), który zwróci prawdę, jeśli obydwa wyrażenia (z jego lewej
        // i prawej strony są prawdziwe).
        if(x > y && x > z) {
            System.out.println("prawda");
        } else {
            System.out.println("nieprawda");
        }
    }
}
