package interfaces;

    // Klasa Cocaine implementuje interfejs Colorable, więc musi zaimplementować
    // wszystkie metody w niej zadeklarowane.
public class Cocaine implements Colorable {
    private int purity;

    public Cocaine(int purity) {
        this.purity = purity;
    }


    // Implementacja metody getColor zdadeklarowanej w interfejsie Colorable.
    @Override
    public String getColor() {
        return "bialy";
    }
}
