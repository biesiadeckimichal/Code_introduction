package streams.zadania;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // metoda statyczna asList z klasy arrays
        List<Person> personList = Arrays.asList(
                new Person("adam", "adamowski", 34, 170, "upierdliwy"),
                new Person("tomek", "tomowski", 24, 165, "skąpy"),
                new Person("piotr", "piotrowski", 27, 180, "marudny"),
                new Person("robert", "robertowski", 30, 184, "wesoły")
        );
    }
}
