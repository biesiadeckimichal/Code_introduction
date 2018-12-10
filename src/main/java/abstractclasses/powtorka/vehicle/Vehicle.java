package abstractclasses.powtorka.vehicle;

public abstract class Vehicle {
    private int maxSpeed;
    private int wheelCount;

    public Vehicle(int maxSpeed, int wheelCount) {
        this.maxSpeed = maxSpeed;
        this.wheelCount = wheelCount;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public abstract void repair();
}
