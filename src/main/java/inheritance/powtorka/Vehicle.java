package inheritance.powtorka;

public class Vehicle {
    private int speed;
    private int maxSpeed;
    private int wheelCount;

    public Vehicle(int speed, int maxSpeed, int wheelCount) {
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.wheelCount = wheelCount;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                ", wheelCount=" + wheelCount +
                '}';
    }
}
