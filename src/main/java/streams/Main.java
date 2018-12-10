package streams;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Strumienie ułatwiają pracę na kolekcjach.

        // Metoda stream() zwróci obiekt typu Stream, który przebiega przez elementy kolekcji.
        // Jest to typ generyczny, gdzie typ sparametryzowany to typ elementów kolekcji.

        // Metoda filter obiektu typu Stream służy do filtrowania. Za parametr przyjmuje predykat - obiekt
        // interfejs Predicate, który jest swego rodzaju testerem - za parametr przyjmuje element ze strumienia
        // a zwraca boolean - czy chcemy "zostawić" ten element (czy przejdzie przez filtr)

        // stream zwraca stream dlatego mozemy to sobie kolko wywolywac
        List<String> strings = Arrays.asList(
                "krakow",
                "katowice",
                "wroclaw",
                "gdansk",
                "sosnowiec",
                "warszawa"
        );

        // typ stream przeleci mi przez liste lub lancuch znakow
        // typ stream zawiera zestaw metod
        // tworzymy tu liste stringow do ktorej przypisujemy strumien
        List<String> startingWithW = strings.stream()
                // .metoda (parametr to strumien ktory przebiega przez dane elementy)
                .filter(s -> s.startsWith("w"))
                .filter(s -> s.endsWith("a"))
                .collect(Collectors.toList());
        System.out.println(startingWithW);

        // Metoda collect służy do zebrania wartości ze strumienia i zwrócenia wartości określonego typu.
        // Aby zwrócić listę użyjemy jako argumentu wyniku metody Collectors.toList())
        // Metoda map przyjmuje jako parametr funkcję przeobrażającą element ze strumienia w inną wartośc.
        List<Integer> stringsLengths = strings.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());
        System.out.println(stringsLengths);

        // Metoda forEach (dostępna też bezpośrednio dla kolekcji) wywoła akcję dla każdego elementu ze strumienia.
        strings.stream()
                .forEach(s -> System.out.println("wykonuje akcje dla: " + s));

        // Metody anyMatch, allMatch i noneMatch zwracają boolean i służą do przetestowania czy elementy ze strumienia
        // spełniają zadane kryterium (w kolejności czy istnieje spełniający, czy wszystkie spełniają, czy żaden nie
        // spełnia).
        boolean anyMatchResult = strings.stream()
                .anyMatch(s -> s.startsWith("g"));
        System.out.println(anyMatchResult);

        // Metoda findFirst zwraca obiekt generycznego typu Optional, który reprezentuje potencjalne przechowywanie
        // wartości - Optional może przechowywać obiekt, ale nie musi.
        // Wyszukajmy w liście łańcuch znaków, który zaczyna się od "Kra".
        // Możemy trafić na taki łańcuch, ale nie musimy.
        Optional<String> stringOptional = strings.stream()
                .filter(s -> s.startsWith("kra"))
                .findFirst();

        // Czy Optional przechowuje wartość sprawdzimy za pomocą metody isPresent
        System.out.println("czy mamy miasto na kra: " + stringOptional.isPresent());
        if (stringOptional.isPresent()) {
            // Wartość możemy pobrać za pomocą metody get
            System.out.println("miasto na kra: " + stringOptional.get());
        }
    }
}
