package classes.lesson;

public class Car {
    private String brand;
    private String color;
    private int maxSpeed;
    // shift + f6 zmienia nazwe parametru

    // konstruktor do wyjasnienia
    public Car(String brand, String color, int maxSpeed) {
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    // nazwy metod do pobierania parametrow nazywamy getterami

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    // wpisujemy w (String) color poniewaz chcemy zmienic dany parametr, wiec
    // musimy ustawic typ zwracanej danej
    public void setColor(String color) {
        this.color = color;
    }
}
