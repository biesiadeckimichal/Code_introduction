package exceptions.powtorka;

import java.util.ArrayList;
import java.util.List;

public class PersonList extends ArrayList<Person> {
    public PersonList getPersonsByAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("nalezy podac wiek > 0");
        }

        PersonList result = new PersonList();
        for (int i = 0; i < size(); i++) {
            Person person = get(i);
            if (age == person.getAge()) {
                result.add(person);
            }
        }
        return result;
    }

    public Person FindPerson(String name, String surname) throws NoSuchPersonException {
        Person person = null;
        for (int i = 0; i < size(); i++) {
            if ((name == get(i).getName()) && (surname == get(i).getSurname())) {
                person = get(i);
            }
        }
        if (person == null) {
            throw new NoSuchPersonException("brak osoby na liscie", name, surname);
        }
        return person;
    }
}
