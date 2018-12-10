package classes.zadania.house;

import java.util.Arrays;

public class House {
    String address;
    Room kitchen;
    Room bathroom;
    Room[] rooms;

    // konstruktor
    public House(String address, Room kitchen, Room bathroom, Room[] rooms) {
        this.address = address;
        this.kitchen = kitchen;
        this.bathroom = bathroom;
        this.rooms = rooms;
    }

    public int getArea() {
        return kitchen.area + bathroom.area;
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", kitchen=" + kitchen +
                ", bathroom=" + bathroom +
                ", rooms=" + Arrays.toString(rooms) +
                '}';
    }
}
