package intlist.powtorka;

import java.util.Arrays;

public class IntList {
    private int[] intList;

    public IntList(int[] intList) {
        int[] newArray = new int[intList.length];
        for (int i = 0; i < intList.length; i++) {
            newArray[i] = intList[i];
        }
        this.intList = newArray;
    }

    public void add(int newElement) {
        int[] addedElementList = new int[intList.length + 1];
        for (int i = 0; i < intList.length; i++) {
            addedElementList[i] = intList[i];
        }
        addedElementList[intList.length] = newElement;
        intList = addedElementList;
    }

    @Override
    public String toString() {
        return "IntList{" +
                "elements=" + Arrays.toString(intList) +
                '}';
    }

    public void remove (int index) {
        int[] removedElementList = new int[intList.length - 1];
        for (int i = 0; i < index; i++) {
            removedElementList[i] = intList[i];
        }
        for (int j = index + 1; j < intList.length; j++) {
            removedElementList[j - 1] = intList[j];
        }
        intList = removedElementList;
    }

    public int get (int index) {
        return intList[index];
    }

    public void removeByValue(int value) {
        int numberOfOccurs = 0;
        for (int i = 0; i < intList.length; i++) {
            if (intList[i] == value) {
                numberOfOccurs ++;
            }
        }
        int[] removedByValueList = new int[intList.length - numberOfOccurs];

        int indexShift = 0;
        for (int i = 0; i < intList.length; i++) {
            if (intList[i] == value) {
                indexShift++;
            } else {
                removedByValueList[i - indexShift] = intList[i];
            }
        }
        intList = removedByValueList;
    }

    public int[] copy(int[] intList) {
        int[] copyList = new int[intList.length];
        for (int i = 0; i < intList.length; i++) {
            copyList[i] = intList[i];
        }
        return copyList;
    }

    // public void insertAt(int value, int index) {
    //     int[] insertedList = new int[intList.length + 1];
    //     for (int i = 0; i < index; i++) {
    //         insertedList[i] = intList[i];
    //     }
    //     insertedList[index] = value;
    //     for (int i = index + 1; i < intList.length; i++) {
    //         insertedList[i + 1] = intList[i];
    //     }
    //     intList = insertedList;
    // }

    // public void insertAt(int indeks, int value){
    //     int[] newArray = new int[elements.length + 1];
    //     int a = 0;
    //     for (int i = 0; i < elements.length +1 ; i++) {
    //         if( indeks != i){
    //             newArray[i] = elements[a];
    //             a++;
    //         }else{
    //             newArray[i] = value;
    //         }
    //     }
    //     elements = newArray;
    // }
}

