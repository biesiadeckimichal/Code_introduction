package wardrobe.powtorka;

public class Socks extends Clothing {
    private String color;

    public Socks(int size, String fabric, String color) {
        super(size, fabric);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + " - Socks{" +
                "color='" + color + '\'' +
                '}';
    }
}
