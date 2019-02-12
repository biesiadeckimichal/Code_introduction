package h_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Typy reprezentujące datę, czas oraz datę z czasem od 8 wersji Javy to:
        // LocalDate, LocalTime i LocalDateTime
        // Obiekty tych typów możemy utworzyć za pomocą funkcji statycznej of:
        LocalDate localDate = LocalDate.of(1986,4,14);
        System.out.println(localDate);

        LocalTime localTime = LocalTime.of(10,31);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.of(localDate,localTime);
        System.out.println(localDateTime);

        // Metoda now() we wspomianych typach zwraca datę/czas z chwili obecnej.
        System.out.println(LocalDateTime.now());

        // Jeśli chcemy utworzyć łańcuch znaków z datą w wybranym formacie, tworzymy obiekt typu
        // DateTimeFormat. Format opisany w części: Patterns for Formatting and Parsing
        // dokumentu https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html?is-external=true

        // wyszukalem w googla datetimeformatter
        // na oraclu znajde instrukcje jak tworzyc daty wg wlasnych ustawien, np yyyy
        // daje 2004, yy 04
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        // Następnie przekazujemy go jako parametr metody format daty, czasu lub daty z czasem
        System.out.println(localDate.format(dateTimeFormatter));

        // W drugą stronę - jeśli chcemy z łańcucha znaków utworzyć datę/czas, użyjemy metody parse
        // gdzie jako pierwszy parametr przekażemy łańcuch znaków, a jako drugi formatter daty/czasu
        LocalDate dateFromString = LocalDate.parse("14.08.2012", dateTimeFormatter);
        System.out.println(dateFromString);

        System.out.println(zadanie1("15.02.2012"));
        System.out.println(zadanie2("12:20"));
        localTime = LocalTime.of(19,39);
        localDate = LocalDate.of(1984,12,31);
        System.out.println(zadanie3(localDate, localTime));
    }

        private static LocalDate zadanie1(String dateString) {
            // deklarujemy sposob przyjecia, wpisania daty do konsoli, nie wyswietlenia
            // formaty w "" szukam na necie musza sie zgadzac
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            // parsujemy lancuch znakow ktory wpisujemy z formatem zapisanym w formaterze
            return LocalDate.parse(dateString, dateTimeFormatter);
        }

        private static LocalTime zadanie2(String timeString) {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("mm:HH");
            return LocalTime.parse(timeString, dateTimeFormatter);
        }

        private static LocalDateTime zadanie3(LocalDate localDate, LocalTime localTime) {
            return LocalDateTime.of(localDate,localTime);
        }
}
