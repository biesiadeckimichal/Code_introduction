package abstractclasses;

public abstract class Vehicle {
    private int maxSpeed;
    private int wheelCount;

    public Vehicle (int maxSpeed, int wheelCount) {
        this.maxSpeed = maxSpeed;
        this.wheelCount = wheelCount;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

//    ponizsze oznacza ze kazda klasa ktora dziedziczy po vehicle
//    musi miec metode repair jak nizej, taka ktora nie przyjmuje parametrow
//    metoda abstrakcyjna moze byc utworzona tylko w klasie abstrakcyjnej
//    klasa abstrakcyjna zawiera metody ktore nie moga zostac wywolane
    public abstract void repair();

    public int getWheelCount() {
        return wheelCount;
    }
}
