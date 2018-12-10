package classes.zadania.party;

import java.util.Arrays;

public class Party {
    Person host;
    Person[] attendees;

    public Party(Person host, Person[] attendees) {
        this.host = host;
        this.attendees = attendees;
    }

    public int getAverageAge() {
        int averageAge = 0;
        for (Person elements: attendees) {
            averageAge += elements.age;
        } return averageAge / attendees.length;
    }

    // public int getAge(Person[] attendees) {
    //     int ageSum = 0;
    //     int averageAge = 0;
    //     for (int i = 0; i < attendees.length; i++) {
    //         ageSum += attendees;
    //     } return ageSum / attendees.length;
    // }

    @Override
    public String toString() {
        return "Party{" +
                "host=" + host + "\n" +
                "attendees=" + Arrays.toString(attendees) +
                '}';
    }
}
