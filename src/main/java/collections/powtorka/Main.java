package collections.powtorka;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        integerList.add(1);
        integerList.add(2);

        List<String> stringList = new ArrayList<>();
        stringList.add("abckot");
        stringList.add("pies");
        stringList.add("malpa");
        stringList.add("pies");

        Set<String> stringSet = new HashSet<>();
        stringSet.add("traktor");
        stringSet.add("motocykl");
        stringSet.add("samolot");
        stringSet.add("samolot");

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("motyl", "lata");
        stringMap.put("pies", "biega");
        stringMap.put("dzdzownica", "dzdzownicuje");


        zadanie1(integerList);
        System.out.println();
        zadanie2(integerList);
        System.out.println();
        System.out.println(zadanie3(integerList));

        System.out.println();
        zadanie4(stringList);
        zadanie5(stringList);
        zadanie6(stringList);
        System.out.println();

        System.out.println(stringList);
        System.out.println(zadanie7(stringList));
        System.out.println(zadanie8(stringSet));

        System.out.println("-------------------");
        System.out.println("Converter");

        Converter<String> stringConverter = new Converter<>();
        System.out.println(stringConverter.toSet(stringList));
        System.out.println(stringConverter.toList(stringSet));

        System.out.println("-------------------");
        System.out.println(stringList);
        System.out.println(zadanie10(stringList));

        System.out.println("-------------------");
        System.out.println(stringMap);
        System.out.println(zadanie11(stringMap));


    }

    // 1. Tworzymy metodę zadanie1, która przyjmie za parametr listę,
    // której elementy są typu Integer, a która wypisze wszystkie elementy listy.
    public static void zadanie1(List<Integer> integerList) {
        for(Integer element: integerList) {
            System.out.println(element);
        }
    }

    // 2. Tworzymy metodę zadanie2, która przyjmie za parametr listę,
    // której elementy są typu Integer, a która wypisze wszystkie elementy listy wraz z ich indeksami.
    public static void zadanie2(List<Integer> integerList) {
        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(i + " " + integerList.get(i));
        };
    }

    // 3. Tworzymy metodę zadanie3, która przyjmie za parametr listę,
    // której elementy są typu Integer, a która zwróci średnią wartości z tej listy.
    public static int zadanie3(List<Integer> integerList) {
        int suma = 0;
        for (Integer element: integerList) {
            suma += element;
        }
        return suma / integerList.size();
    }

    // public static void zadanie4(List<String> stringList) {
    //     for (int i = 0; i < stringList.size(); i++) {
    //         String first3Letters = "";
    //         for (int j = 0; j < 3; j++) {
    //             first3Letters += stringList.get(i).charAt(j);
    //         }
    //         if (first3Letters == "abc") {
    //             System.out.println(first3Letters);
    //         }
    //     }
    // }

    // 4. Tworzymy metodę zadanie4, która przyjmie za parametr listę Stringów,
    // a która zwróci odpowiedź na pytanie, czy lista zawiera łańcuch znaków,
    // który rozpoczyna się od znaków "abc".
    public static void zadanie4(List<String> stringList) {
        for (String element: stringList) {
            if (element.startsWith("abc")){
                System.out.println(element);
            }
        }
    }

    // 5. Tworzymy metodę zadanie5, która przyjmie za parametr listę Stringów,
    // a która zwróci odpowiedź na pytanie, ile elementów ma nieparzystą liczbę znaków.
    public static void zadanie5(List<String> stringList) {
        int evenElement = 0;
        for (String element: stringList) {
            if (element.length() % 2 != 0) {
                evenElement += 1;
            }
        }
        System.out.println(evenElement);
    }

    // 6. Tworzymy metodę zadanie6, która przyjmie za parametr zbiór Stringów,
    // a która zwróci odpowiedź na pytanie, czy w zbiorze mamy łańcuch znaków,
    // który kończy się na tekst "cde".
    public static void zadanie6(List<String> stringList) {
        for (String element: stringList) {
            if (element.endsWith("cde")) {
                System.out.println(element);
            }
        }
    }

    // 7. Tworzymy metodę zadanie7, która za parametr przyjmie listę Stringów,
    // a zwróci zbiór, zawierający elementy tej listy.
    public static Set<String> zadanie7(List<String> stringList) {
        Set<String> stringSet = new HashSet<>();
        for (int i = 0; i < stringList.size(); i++) {
            stringSet.add(stringList.get(i));
        }
        return stringSet;
    }

    // 8. Tworzymy metodę zadanie8, która za parametr przyjmie zbiór Stringów,
    // a zwróci listę, zawierającą elementy tego zbioru.
    public static List<String> zadanie8(Set<String> stringSet) {
        List<String> stringList = new ArrayList<>();
        for (String element: stringSet) {
            stringList.add(element);
        }
        return stringList;
    }

    // 10. Tworzymy metodę zadanie10, która za parametr przyjmie listę stringów,
    // a która zwróci w wyniku mapę, której klucze będą indeksami elementów z listy,
    // a wartościami będą elementy z listy.
    public static Map<Integer, String> zadanie10(List<String> stringList) {
        Map<Integer, String> hashMap = new HashMap<>();
        for(int i = 0; i < stringList.size(); i++) {
            hashMap.put(i, stringList.get(i));
        }
        // for (String element: stringList) {
        //     hashMap.get(element);
        // }
        return hashMap;
    }

    // 11. Tworzymy metodę zadanie11, która za parametr przyjmie mapę,
    // której klucze oraz wartości to Stringi, a która zwróci mapę,
    // która dla klucza "klucze" będzie przechowywała listę kluczy,
    // a dla klucza "wartosci" będzie przechowywała listę wartości.
    public static HashMap<ArrayList, ArrayList> zadanie11 (Map<String, String> myMap) {
        HashMap<ArrayList, ArrayList> myNewMap = new HashMap<>();
        // List<String> keys = new ArrayList<>();
        // List<String> values = new ArrayList<>();
        ArrayList<String> keys = new ArrayList<>();
        ArrayList<String> values = new ArrayList<>();
        for(String key: myMap.keySet()) {
            keys.add(key);
        }
        for(String value: myMap.values()) {
            values.add(value);
        }
        myNewMap.put(keys, values);
        return myNewMap;
    }

    // 12. Tworzymy metodę zadanie12, która za parametr przyjmie zbiór stringów,
    // a zwróci mapę, której kluczem będzie każdy łańcuch znaków z parametru (zbioru),
    // a wartością będzie odpowiedź na to, ile dany łańcuch zawiera znaków "a".
    // public static Map<String, Integer> zadanie12(Set<String> mySet) {
    //     HashMap<String, Integer> newMap = new HashMap<>();
    //     for (String element: mySet) {
    //         newMap.get(element);
    //     }
    //
    //     private static int counter(String string) {
    //
    //
    //     }
    // }
}
