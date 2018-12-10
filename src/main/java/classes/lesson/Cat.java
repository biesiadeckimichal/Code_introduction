package classes.lesson;

public class Cat {
    // klasy piszemy z duzej litery dlatego String jest klasa
    String name;
    String breed;
    int age;
    boolean dead;

    // tworzymy konstrukt domyslny czyli taki ktory nie ma parametru
    // po to zeby nam w linijce 4 new classes.lesson.Cat() nie wywalalo bledu

    Cat(){}

    // tworzymy konstruktor
    // konstruktor tez jest metoda(choc nie kazdy sie z tym zgodzi)
    Cat(String name) {
        // pole name obiektu classes.lesson.Cat, this uzywamy zeby to pole bylo unikatowe
        // dla danego obiektu
        this.name = name;
    }

    // tworzymy konstruktor po to zebysmy mogli tworzyc koty w jednej lini jak w 23
    // bez konstruktora musielibysmy wypisywac wszystkie dane jak w lini 4 - 8
    public Cat(String name, String breed, int age, boolean dead) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.dead = dead;
    }

    // to co sie pojawilo to metoda
    @Override
    public String toString() {
        return "classes.lesson.Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", dead=" + dead +
                '}';
    }

    // tworzymy metode do zabicia kota
    void kill() {
        dead = true;
    }

    // tworzymy metode do sprawdzenia czy kot jest  stary
    boolean isOld() {
        return age >= 15;
    }
}

