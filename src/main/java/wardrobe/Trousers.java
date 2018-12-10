package wardrobe;

public class Trousers extends Clothing {
    private boolean jeans;

    public Trousers(int size, String fabric, boolean jeans) {
        super(size, fabric);
        this.jeans = jeans;
    }

    public boolean isJeans() {
        return jeans;
    }

    @Override
    public String toString() {
        return "Trousers{" +
                "jeans=" + jeans +
                "} " + super.toString();
    }
}