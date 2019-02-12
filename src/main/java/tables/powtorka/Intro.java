package tables.powtorka;

public class Intro {
    public static void main(String[] args) {
        int[] intArray = {10, 2, 43, 5};

        System.out.println(intArray[0]);

        printLastElement(intArray);
        System.out.println();
        printElements(intArray);
        System.out.println();
        getMax(intArray);


    }

    public static void printLastElement(int[] ints) {
        System.out.println(ints[ints.length - 1]);
    }

    public static void printElements(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    public static void getMax(int[] ints) {
        int max = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > max) {
                max = ints[i];
            }
        }
        System.out.println(max);
    }
}
