package wardrobe.powtorka;

public class TShirt extends Clothing {
    private boolean sleeveless;

    public TShirt(int size, String fabric, boolean sleeveless) {
        super(size, fabric);
        this.sleeveless = sleeveless;
    }

    public boolean isSleeveless() {
        return sleeveless;
    }

    public void setSleeveless(boolean sleeveless) {
        this.sleeveless = sleeveless;
    }

    @Override
    public String toString() {
        return super.toString() + " - TShirt{" +
                "sleeveless=" + sleeveless +
                '}';
    }
}
