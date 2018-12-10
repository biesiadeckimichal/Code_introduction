package staticField;

public class Horse {
    private int maneLength;
    private int weight;
    private String name;

    private static int count;
    private static int combinedManeLength;

    public Horse(int maneLength, int weight, String name) {
        this.maneLength = maneLength;
        this.weight = weight;
        this.name = name;
        count++;
        combinedManeLength += maneLength;
    }

    public static int getCount() {
        return count;
    }

    // public static int getCombinedManeLength() {
    //     return combinedManeLength
    // }
}
