package abstractclasses.powtorka.vehicle;

public class Car extends Vehicle {
    private int doorCount;

    public Car(int maxSpeed, int wheelCount, int doorCount) {
        super(maxSpeed, wheelCount);
        this.doorCount = doorCount;
    }

    public int getDoorCount() {
        return doorCount;
    }

    @Override
    public void repair() {
        System.out.println("naprawiam samochod");
    }

}
