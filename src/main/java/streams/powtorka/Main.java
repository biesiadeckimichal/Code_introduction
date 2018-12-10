package streams.powtorka;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("kot");
        animals.add("pies");
        animals.add("rekin");
        animals.add("anakonda");

        Person person1 = new Person("Franek", "Frankowski", 30, 180, "upierdliwiec");
        Person person2 = new Person("Antek", "Antkowski", 20, 170, "sknera");
        Person person3 = new Person("Dawid", "Dawidowski", 15, 160, "maruda");
        Person person4 = new Person("Pawel", "Pawlowski", 40, 190, "pesymista");


        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        List<String> peopleList = new ArrayList<>();



        List<String> zadanie1_longerThan3 = animals.stream()
                .filter(s -> s.length()>3)
                .collect(Collectors.toList());
        System.out.println(zadanie1_longerThan3);

        List<String> zadanie2_first3Characters = animals.stream()
                .map(s -> s.substring(0,3))
                .collect(Collectors.toList());
        System.out.println(zadanie2_first3Characters);

        long zadanie3_startsEndsWithA = animals.stream()
                .filter(s -> s.startsWith("a") && s.endsWith("a"))
                .count();
        System.out.println(zadanie3_startsEndsWithA);

        List<String> zadanie4_removeLastLetter = animals.stream()
                .map(s -> s.substring(0, s.length() - 1))
                .filter(s -> s.length() > 2)
                .collect(Collectors.toList());
        System.out.println(zadanie4_removeLastLetter);

        System.out.println("---------------------------------");

        // List<Person> zadanie5_olderThan20orHigherThan175 = people.stream()
        //         .filter(person -> person.getAge() > 20 || person.getHeight() > 175)
        //         .map(person -> person.getName() + " " + person.getSurname())
        //         .forEach(n -> System.out.println(n));
        // System.out.println(zadanie5_olderThan20orHigherThan175);

        zadanie5_olderThan20orHigherThan175(people);
        zadanie6_youngerThan18ToList(people);


    }

    private static void zadanie5_olderThan20orHigherThan175(List<Person> people) {
        people.stream()
                .filter(person -> person.getAge() > 20 || person.getHeight() > 175)
                .map(person -> person.getName() + " " + person.getSurname() + " " + person.getAge() + " " + person.getHeight())
                .forEach(n -> System.out.println(n));
    }
    // JAK PRZYPISAC WYNIK DO LISTY?

    private static void zadanie6_youngerThan18ToList (List<Person> people) {
        people.stream()
                .filter(person -> person.getAge() < 18)
                .collect(Collectors.toList())
                .forEach(person -> System.out.println(person));
    }
    //         list.stream().collect(Collectors.toMap(Item::getKey, item -> item));
    // Map<String, Item> map =
    // zadanie7













}
