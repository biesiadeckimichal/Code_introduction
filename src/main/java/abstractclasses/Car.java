package abstractclasses;

public class Car extends Vehicle {
    private int doorCount;

    public Car(int maxSpeed, int doorCount) {
        super(maxSpeed, 4);
        this.doorCount = doorCount;
    }

    public int getDoorCount() {
        return doorCount;
    }

    @Override
    public void repair() {
        System.out.println("Naprawiam samochod");
    }
}
