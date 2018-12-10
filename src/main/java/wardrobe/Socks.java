package wardrobe;

public class Socks extends Clothing {
    private boolean high;

    public Socks(int size, String fabric, boolean high) {
        super(size, fabric);
        this.high = high;
    }

    public boolean isHigh() {
        return high;
    }

    @Override
    public String toString() {
        return "Socks{" +
                "noSleeves=" + high +
                "} " + super.toString();
    }
}
