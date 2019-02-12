package collections.zadania;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        intList.add(6);
        intList.add(6);

        List<String> stringList = new ArrayList<>();
        stringList.add("esw");
        stringList.add("abckot");
        stringList.add("abcrybacde");

        zadanie1(intList);
        System.out.println();

        zadanie2(intList);
        System.out.println();

        zadanie3(intList);
        System.out.println();

        zadanie4(stringList);
        System.out.println();

//        tak musialaby wygladac skladnia dla niestatycznej metody
//        czyli takiej ktora wymaga obiektu
//        a wiec stosujemy ja gdy chcemy sie dostac do jakiegos np pola
//        Chair main = new Chair();
//        main.zadanie5();


        System.out.println(zadanie5(stringList));
        System.out.println();

        System.out.println(zadanie6(stringList));
    }

    // static nie wymaga obiektu, a wiec wywolujemy ja metoda(intList), a nie intList.metoda
    // jak nie wpisuje static to pracuje na obiekcie, czyli zapisuje np intList.add
    public static void zadanie1(List<Integer> intList) {
        for (Integer element: intList){
            System.out.println(element);
        }
    }

    public static void zadanie2(List<Integer> intList) {
        for (int i = 0; i < intList.size(); i++) {
            System.out.println("indeks: " + i + " " + intList.get(i));
        }
    }

    public static void zadanie3(List<Integer> intList) {
        int srednia = 0;
        int suma = 0;
        for (int i = 0; i < intList.size(); i++) {
            suma += intList.get(i);
        }
        srednia = suma / intList.size();
        System.out.println(srednia);
    }

    public static void zadanie4 (List<String> stringList) {
        for (String stringElement : stringList) {
            if (stringElement.contains("abc")) {
                System.out.println(stringElement + " zawiera abc");
                break;
            }
        }
    }

    public static boolean zadanie4_1(List<String> stringList) {
        String abc = "abc";
        for (String string: stringList) {
            if(string.length() > 2) {
                boolean zawieraAbc = true;
                for (int i = 0; i < 3; i++) {
                    if(string.charAt(i) != abc.charAt(i)) {
                        zawieraAbc = false;
                    }
                }
                if(zawieraAbc) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int zadanie5 (List<String> stringList) {
        int ileElementowNieparzystych = 0;
        for (String element: stringList) {
            if (element.length() % 2 != 0) {
                ileElementowNieparzystych += 1;
            }
        } return ileElementowNieparzystych;
    }

    public static boolean zadanie6 (List<String> stringList) {
        String cde = "cde";
        for (String element: stringList) {
            if (element.length() > 2) {
                boolean zawieraCde = false;
                for (int i = 0; i < 3; i++) {
                    if (element.charAt(element.length()-3+i) == cde.charAt(i)) {
                        zawieraCde = true;
                    }
                }
                if (zawieraCde) {
                    return true;
                }
            }
        } return false;
    }




}

