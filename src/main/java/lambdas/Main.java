package lambdas;

import com.sun.javafx.geom.ConcentricShapePair;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Jeśli chcemy uzyskać obiekt, który jest implementacją interfejsu z tylko jedną metodą abstrakcyjną
        // możemy użyć lambdy. Lambda to ta jedyna metoda zdefiniowana "w linii". Z lewej strony -> umieszczamy
        // argumenty (możemy je umieścić w nawiasach, jeśli brak argumentów to w nawiasach niczego nie umieścimy).
        // Z prawej strony znaków -> umieszczamy ciało funkcji - kod wykonywany przez metodę.
        // lambde mozemy stosowac tylko dla klas, interfaceow z jedna metoda
        // Consumer<T - typ t - nazwa>
        Runnable myRunnable = () -> System.out.println("Akcja!");
        myRunnable.run();

        // Jeśli w lambdzie ma być wykonana więcej niż jedna instrukcja używamy bloku kodu.
        myRunnable = () -> {
            System.out.println("akcja 1");
            System.out.println("akcja 2");
        };
        myRunnable.run();

        // Consumer to interfejs, który ma jedną metodę abstrakcyjną (accept), która przyjmuje parametr typu
        // sparametryzowanego, a która nicezgo nie zwraca.
        Consumer<String> myConsumer = s -> System.out.println(
                "przekazano jako parametr " + s);
        myConsumer.accept("abcde");

        // Function to interfejs, który przyjmuje parametr pierwszego typu sparametryzowanego, a zwraca wartość
        // drugiego typu sparametryzowanego. W tym przypadku implementujemy metodę apply, która zwróci długość łańcucha
        // znaków.
        Function<String, Integer> myFunction = s -> s.length();
        System.out.println(myFunction.apply("abcde"));
    }
}
