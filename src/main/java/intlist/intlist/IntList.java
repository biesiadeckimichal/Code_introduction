package intlist.intlist;

public class IntList {
    // tworzymy tablice intow ktora bedziemy uzywali jako obiektu
    private int[] intList;

    // konstruktor ktory bedziemy uzywali do tworzenia pustej listy
    public IntList() {
        intList = new int[0];
    }

    // konstruktor
    // przypisuje wartosc parametru int[] intList polu obiektu intList tak
    // aby to przechowac

    public IntList(int[] intList){
        int[] newArray = new int[intList.length];
        for (int i = 0; i < intList.length; i++) {
            newArray[i] = intList[i];
        }
        this.intList = newArray;
    }

    // metoda do wyswietlania intow
    // przez to ze jest tu public odwolujemy sie do konkretnego obiektu
    public void print(){
        for(int element: intList) {
            System.out.println(element);
        }
    }

    public void add(int element) {
        int[] newElements = new int[intList.length + 1];
        for (int i = 0; i < intList.length; i++) {
            newElements[i] = intList[i];
        }
        newElements[intList.length] = element;
        intList = newElements;
    }

    // shift + f6 refactor, lub ctr + r
    public void remove(int index) {
        int[] newElements = new int[intList.length - 1];
        for (int i = 0; i < index; i++) {
            newElements[i] = intList[i];
        }
        for (int j = index + 1; j < intList.length; j++) {
            newElements[j - 1] = intList[j];
        }
        intList = newElements;
    }

    public int get(int index) {
        return intList[index];
    }

    public int[] copy(int[] intList) {
        int[] copyList = new int[intList.length];
        for (int i = 0; i < intList.length; i++) {
            copyList[i] = intList[i];
        }
        return copyList;
    }
}
