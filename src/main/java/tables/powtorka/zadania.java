package tables.powtorka;

public class zadania {
    public static void main(String[] args) {
        int[] intArray1 = {11, 2, 1, 1, 4, 8, 8};
        int[] intArray2 = {82, 43, 5};

        print(intArray1);
        System.out.println();
        System.out.println();

        System.out.println(getMax(intArray1));
        System.out.println();

        System.out.println(getMin(intArray1));
        System.out.println();

        System.out.println("suma 1: " + getSum(intArray1));
        System.out.println("suma 2: " + getSum(intArray2));
        System.out.println();

        print(getMaxMinAndSum(intArray1));
        System.out.println();
        System.out.println();

        print((getLarger(intArray1, intArray2)));
        System.out.println();
        System.out.println();

        print(intArray1);
        System.out.println();
        print(intArray2);
        System.out.println();
        System.out.println();

        print(merge(intArray1, intArray2));
        System.out.println();
        System.out.println();

        System.out.println("liczba unikalnych: " + getDistinct(intArray1));

    }

    public static void print(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }

    public static int getMax(int[] intArray) {
        int highest = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > highest) {
                highest = intArray[i];
            }
        }
        return highest;
    }

    public static int getMin(int[] intArray) {
        int minimum = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] < minimum) {
                minimum = intArray[i];
            }
        }
        return minimum;
    }

    public static int getSum(int[] intArray) {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        return sum;
    }

    public static int[] getMaxMinAndSum(int[] intArray) {
        int[] newArray = new int[3];
        int highest = intArray[0];
        int lowest = intArray[0];
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > highest) {
                highest = intArray[i];
            }
            if (intArray[i] < lowest) {
                lowest = intArray[i];
            }
            sum += intArray[i];
            newArray[0] = highest;
            newArray[1] = lowest;
            newArray[2] = sum;
        }
        return newArray;
    }

    public static int[] getMaxMinAndSum1(int[] intArray) {
        int[] newArray = new int[3];
        newArray[0] = getMax(intArray);
        newArray[1] = getMin(intArray);
        newArray[2] = getSum(intArray);
        return newArray;
    }

    public static int[] getLarger(int[] intArray1, int[] intArray2) {
        if (getSum(intArray1) > getSum(intArray2)) {
            return intArray1;
        } else return intArray2;
    }

    public static int[] merge(int[] intArray1, int[] intArray2) {
        int[] mergedArray = new int[intArray1.length + intArray2.length];
        for (int i = 0; i < intArray1.length; i++) {
            mergedArray[i] = intArray1[i];
        }
        for (int i = 0; i < intArray2.length; i++) {
            mergedArray[intArray1.length + i] = intArray2[i];
        }
        return mergedArray;
    }

    public static int getDistinct(int[] intArray) {
        int sumOfuniqueElements = 0;
        for (int i = 0; i < intArray.length; i++) {
            boolean isUnique = false;
            for (int j = 0; j < i; j++) {
                if (intArray[i] == intArray[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique == true) {
                sumOfuniqueElements += 1;
            }
        } return sumOfuniqueElements;
    }

    // public static String[] getDistinct(String[] stringTable) {
    //     int uniqueValue = 0;
    //     int sumOfUniqueValue = 0;
    //     int k = 0;
    //     String[] tempTable = new String[stringTable.length];
    //
    //     for (int i = 0; i < stringTable.length; i++) {
    //
    //         for (int j = 0; j < stringTable.length; j++) {
    //             if (stringTable[i] != tempTable[j]) {
    //                 uniqueValue = 1;
    //             } else {
    //                 uniqueValue = 0;
    //                 break;
    //             }
    //         }
    //
    //         if (uniqueValue == 1) {
    //             tempTable[k] = stringTable[i];
    //             k = k + 1;
    //             sumOfUniqueValue = sumOfUniqueValue + uniqueValue;
    //         }
    //     }
    //
    //     String[] results = new String[sumOfUniqueValue];
    //
    //     for (int i = 0; i < sumOfUniqueValue; i++) {
    //         results[i] = tempTable[i];
    //     }
    //
    //     return results;
    // }

}
