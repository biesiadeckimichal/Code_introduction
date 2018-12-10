package tables;

public class Case4 {
    public static void main(String[] args) {
        int[] intArray = {0, 2, 5};
        System.out.println(getSum(intArray));

    }

    public static int getSum(int[] someArray) {
        int suma = 0;
        for (int i = 0; i < someArray.length; i++) {
            suma += someArray[i];
        }
        return suma;
    }
}
