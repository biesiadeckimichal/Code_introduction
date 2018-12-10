package inheritance.powtorka;

public class Bicycle extends Vehicle {
    private int numberOfGears;
    private String type;

    public Bicycle(int speed, int maxSpeed, int numberOfGears, String type) {
        super(speed, maxSpeed, 2);
        this.numberOfGears = numberOfGears;
        this.type = type;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public String getType() {
        return type;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + "Bicycle{" +
                "numberOfGears=" + numberOfGears +
                ", type='" + type + '\'' +
                '}';
    }
}
