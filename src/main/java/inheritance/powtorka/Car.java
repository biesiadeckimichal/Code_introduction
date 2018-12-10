package inheritance.powtorka;

public class Car extends Vehicle {
    private int engine;
    private String carBrand;

    public Car(int speed, int maxSpeed, int engine, String carBrand) {
        super(speed, maxSpeed, 4);
        this.engine = engine;
        this.carBrand = carBrand;
    }

    public int getEngine() {
        return engine;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    @Override
    public String toString() {
        return super.toString() + "Car{" +
                "engine=" + engine +
                ", carBrand='" + carBrand + '\'' +
                '}';
    }
}
