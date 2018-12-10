package classes.lesson.person;


public class PersonTest {
    // "Tomasz", "Nowak", "ul. Jakas, gdziestam", 1980, mohter, father;
    private String firstName;
    private String lastName;
    private String address;
    private int birth;
    private PersonTest mother;
    private PersonTest father;

    public PersonTest(String firstName, String lastName, String address, int birth, PersonTest mother, PersonTest father) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.birth = birth;
        this.mother = mother;
        this.father = father;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getAddress() {
        return address;
    }

    public PersonTest getFather() {
        return father;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Boolean isParent(PersonTest personToBeCompared) {
        return this == personToBeCompared.father || this == personToBeCompared.mother;
    }

    public Boolean isOlderThan(PersonTest personToBeCompared) {
        return this.birth < personToBeCompared.birth;
    }



    @Override
    public String toString() {
        return
            "firstName: " + firstName + "\n" +
            "lastName: " + lastName + "\n" +
            "address: " + address + "\n" +
            "birth: " + birth + "\n" +
            "mother: " + mother + "\n" +
            "father: " + father;
    }

}

