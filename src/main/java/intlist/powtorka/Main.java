package intlist.powtorka;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {3, 3, 4, 5};
        // int[] intArray = new int[3];
        // intArray[0] = 3;
        // intArray[1] = 4;
        // intArray[2] = 5;

        int[] intArray1 = new int[3];
        intArray1[0] = 4;
        intArray1[1] = 4;
        intArray1[2] = 4;

        IntList intList = new IntList(intArray);
        IntList intList1 = new IntList(intArray1);

        System.out.println(intList.toString());
        System.out.println(intList1.toString());
        System.out.println();

        intList1.add(10);
        System.out.println(intList);

        intList1.remove(1);
        System.out.println(intList1);
        System.out.println();

        System.out.println(intList);
        System.out.println();

        System.out.println(intList.get(0));
        System.out.println();

        intList.removeByValue(3);
        System.out.println(intList);
        System.out.println();

        intList.copy(intArray);
        System.out.println(intList);
        System.out.println();

        // intList.insertAt(3,1);
        // System.out.println(intList);
    }
}
