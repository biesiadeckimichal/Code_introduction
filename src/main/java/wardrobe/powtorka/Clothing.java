package wardrobe.powtorka;

public class Clothing {
    private int size;
    private String fabric;

    public Clothing(int size, String fabric) {
        this.size = size;
        this.fabric = fabric;
    }

    public int getSize() {
        return size;
    }

    public String getFabric() {
        return fabric;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "size=" + size +
                ", fabric='" + fabric + '\'' +
                '}';
    }
}
