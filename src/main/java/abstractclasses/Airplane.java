package abstractclasses;

public class Airplane extends Vehicle{
    private String airlines;

    public Airplane(int maxSpeed, int wheelCount, String airlines) {
        super(maxSpeed, wheelCount);
        this.airlines = airlines;
    }

    public String getAirlines() {
        return airlines;
    }

    @Override
    public void repair() {
        System.out.println("Naprawiam samolot");
    }
}
