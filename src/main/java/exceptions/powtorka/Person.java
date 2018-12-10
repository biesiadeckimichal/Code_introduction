package exceptions.powtorka;

public class Person {
    private int age;
    private String name;
    private String surname;
    private float height;
    private String comment;

    public Person(int age, String name, String surname, float height, String comment)
            throws IncorrectAgeException {
        if (age < 0) {
            throw new IncorrectAgeException("Age has to be a positive integer", age);
        }
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.comment = comment;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public float getHeight() {
        return height;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + height +
                ", comment='" + comment + '\'' +
                '}';
    }
}
