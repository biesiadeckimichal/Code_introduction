package classes.lesson.person;

public class Main {
    public static void main(String[] args) {
        // Utworzymy obiekt typu Person
        Person tomaszNowak = new Person("Tomasz", "Nowak", "ul. Jakas, gdziestam", 1980, null, null);
        System.out.println(tomaszNowak.getFirstName());
        tomaszNowak.setAddress("ul. Inna 123");
        System.out.println(tomaszNowak.getAddress());

        // Utworzymy inny obiekt typu Person
        Person annaNowak = new Person("Anna", "Nowak", "ul. Inna 123", 1995, null, tomaszNowak);
        // Sprawdzimy, czy Tomasz Nowak jest rodzicem Anny Nowak
        System.out.println(tomaszNowak.isParentOf(annaNowak));

        // Następnie sprawdzimy, czy Tomasz Nowak jest starszy niż Anna Nowak
        System.out.println(tomaszNowak.isOlderThan(annaNowak));
    }
}
