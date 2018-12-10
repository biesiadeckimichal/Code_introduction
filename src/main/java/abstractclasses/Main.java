package abstractclasses;

public class Main {
    public static void main(String[] args) {
//        Vehicle myVehicle = new Vehicle(50,3);
        Car myCar = new Car(180,5);
        Airplane myAirplane = new Airplane(700,3,"lot");

        repair(myCar);
        repair(myAirplane);

        Vehicle[] vehicles = {myCar, myAirplane};
        for (Vehicle vehicle : vehicles) {
            vehicle.repair();
        }
    }
//    metoda statyczna jest ogolna np ogolna instrukcja obslugi dla samochodow
//    chodzi o to ze nie musze tworzyc specjalnie obiektu
//    metoda niestatyczna jest wazna dla konkretnego obiektu

    public static void repair(Vehicle vehicle) {
        vehicle.repair();
    }
}
