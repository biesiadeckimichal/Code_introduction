package classes.lesson;

public class Encapsulation {
    public static void main(String[] args) {
        Car myCar = new Car("ford", "niebieski", 200);
        System.out.println(myCar.getBrand());
        System.out.println(myCar.getColor());
        System.out.println(myCar.getMaxSpeed());

        myCar.setColor("czerwony");
        System.out.println(myCar.getColor());
    }
}
