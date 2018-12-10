package tables;

public class Case2 {
    public static void main(String[] args) {
        int[] intArray = {20, 1, 5};
        System.out.println(getMax(intArray));
    }

    public static int getMax(int[] someArray) {
        int highest = 0;
        for (int i=0; i<someArray.length; i++) {
            if (someArray[i]>highest) {
                highest = someArray[i];
            }
        }
        return highest;
    }
}
