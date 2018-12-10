package wardrobe.powtorka;

public class Trousers extends Clothing {
    private String type;

    public Trousers(int size, String fabric, String type) {
        super(size, fabric);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + " - Trousers{" +
                "type='" + type + '\'' +
                '}';
    }
}
