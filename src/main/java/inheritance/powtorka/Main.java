package inheritance.powtorka;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(20,60,20,"skladak");
        Vehicle car = new Car(100,160,2, "audi");


        System.out.println(bicycle);
        System.out.println(car);




    }
}
