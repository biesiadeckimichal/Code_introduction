package inheritance.vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle newVehicle = new Vehicle(100, 200, 4);
        Car fiat500 = new Car(100,200,5,2,"fiat");
        Bicycle wigry = new Bicycle(30,60,2,14,"skladak");

        System.out.println(fiat500.toString());
        System.out.println(wigry.toString());
    }
}