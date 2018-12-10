package abstractclasses.powtorka.vehicle;

public class Main {
    public static void main(String[] args) {
        // Vehicle myVehicle = new Vehicle(50,3);
        Car myCar = new Car(180, 4, 5);
        Airplane myAirplane = new Airplane(500, 12, "lot");

        // repair(myCar);

        Vehicle[] vehicles = {myAirplane, myCar};
        for (Vehicle vehicle : vehicles) {
            vehicle.repair();
        }
    }

}
