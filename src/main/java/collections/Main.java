package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------Listy----------");
        lists();
        System.out.println("--------------------");

        System.out.println("\n----------Mapy----------");
        maps();
        System.out.println("--------------------");

        System.out.println("\n----------Zbiory----------");
        sets();
        System.out.println("--------------------");
    }

    private static void lists() {
        // czemu tu jest ArrayList?
        List<String> stringList = new ArrayList<>();
        stringList.add("Dariusz");
        stringList.add("Mariusz");
        stringList.add("Tadeusz");
        System.out.println(stringList);

        System.out.println("Element o indeksie 1: " + stringList.get(1));
        stringList.remove(1);
        System.out.println(stringList);
        System.out.println("Liczba elementów listy: " + stringList.size());

        for(String string: stringList) {
            System.out.println("Element listy: " + string);
        }

        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("Stefan");
        System.out.println(stringLinkedList.get(0));
        System.out.println(stringLinkedList);
    }

    private static void maps() {
        Map<String, String> plToEndDictionary = new HashMap<>();
        plToEndDictionary.put("pies", "dog");
        plToEndDictionary.put("kot", "cat");
        plToEndDictionary.put("dom", "house");

        System.out.println("Wartosc dla klucza pies: "
                + plToEndDictionary.get("pies"));

        for (String key : plToEndDictionary.keySet()) {
            System.out.println("Klucz: " + key
                    + ", wartość: " + plToEndDictionary.get(key));
        }

        plToEndDictionary.remove("dom");
        System.out.println(plToEndDictionary.get("dom"));

        for (String value : plToEndDictionary.values()) {
            System.out.println("Wartość: " + value);
        }
    }

    private static void sets() {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Nowak");
        stringSet.add("Zarzycki");
        stringSet.add("Kowalski");

        System.out.println(stringSet);

        stringSet.remove("Nowak");
        System.out.println(stringSet);
        for(String string: stringSet) {
            System.out.println("element zbioru: " + string);
        }
    }

    public static void print(List<String> stringList) {
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
    }
}
