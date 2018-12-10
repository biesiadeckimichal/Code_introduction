package exceptions.person;

public class Person {
    private int age;

    // to jest konstruktor
    // throws przekazuje wyjatek do metody wyzej, ktora wywolala ta metode
    public Person(int age) throws IncorrectAgeException{
        // tu sprawdzamy wiek, jesli warunek jest prawda to tworzymy nowy obiekt
        // klasy IncorrectAgeException
        if (age < 0) {
            throw new IncorrectAgeException("Wiek musi " +
                    "być wartością nieujemną", age);
        }
        this.age = age;
    }
}
