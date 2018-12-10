package wardrobe;

public class Clothing {
    private int size;
    private String fabric;

    public Clothing(int size, String fabric) {
        this.size = size;
        this.fabric = fabric;
    }

    public String getFabric() {
        return fabric;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "size=" + size +
                ", fabric='" + fabric + '\'' +
                '}';
    }
}