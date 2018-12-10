package classes.lesson.person;

public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private int yearOfBirth;
    private Person mother;
    private Person father;

    public Person(String firstName,
                  String lastName,
                  String address,
                  int yearOfBirth,
                  Person mother,
                  Person father) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.yearOfBirth = yearOfBirth;
        this.mother = mother;
        this.father = father;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public String getAddress() {
        return address;
    }

    // jako parametr
    // Metoda służy do sprawdzenia, czy osoba, dla której wywołano metodę, jest rodzicem osoby przekazanej
    public boolean isParentOf(Person osoba) {
        return this == osoba.mother || this == osoba.father;
    }
        // Można też zapisać to tak jak niżej, z tymże wtedy ma to postać:
        // jeśli jest rodzicem to zwróć prawdę, jeśli nie jest rodzicem to zwróć fałsz. Więc można od razu
        // zwrócić czy jest rodzicem.
//        if(this == person.mother || this == person.father) {
//            return true;
//        } else {
//            return false;
//        }


    // Metoda sprawdza, czy osoba dla której wywołano metodę jest starsza od osoby przekazanej jako parametr
    public boolean isOlderThan(Person person) {
        return yearOfBirth < person.yearOfBirth;
    }
}
