package wardrobe;

public class TShirt extends Clothing {
    private boolean noSleeves;

    public TShirt(int size, String fabric, boolean noSleeves) {
        super(size, fabric);
        this.noSleeves = noSleeves;
    }

    public boolean hasNoSleeves() {
        return noSleeves;
    }

    @Override
    public String toString() {
        return "TShirt{" +
                "noSleeves=" + noSleeves +
                "} " + super.toString();
    }
}