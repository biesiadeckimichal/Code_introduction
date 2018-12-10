package intlist.intlist;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {5, 3, 7};
        // deklaruje zmienna typu IntList i tworze obiekt przy pomocy
        // konstruktora, wywolujemy go przez slowo new
        IntList myIntList = new IntList(intArray);

        System.out.println("dodawanie elementu do listy:");
        myIntList.add(10);
        myIntList.print();

        System.out.println();

        System.out.println("usuwanie elementu: ");
        myIntList.remove(1);
        myIntList.print();

        System.out.println();

        System.out.println("wyswietlanie zadanego elementu: ");
        System.out.println(myIntList.get(1));
    }
}
