package classes.zadania.party;

public class Main {
    public static void main(String[] args) {
        Person host = new Person("michal", "biesiadecki", 33);
        Person attendee1 = new Person("adam", "nowak", 35);
        Person attendee2 = new Person("piotr", "mickiewicz", 30);
        Person attendee3 = new Person("ignacy", "paderewski", 25);
        Person[] attendees = new Person[3];
        attendees[0] = attendee1;
        attendees[1] = attendee2;
        attendees[2] = attendee3;

        Party party = new Party(host,attendees);

        System.out.println("uczestnicy imprezy to: " +
            host.firstName + " " +
            attendee1.firstName + " " +
            attendee2.firstName + " " +
            attendee3.firstName
        );

        System.out.println();

        System.out.println(party.toString());

        System.out.println();

        System.out.println(party.getAverageAge());
    }
}
