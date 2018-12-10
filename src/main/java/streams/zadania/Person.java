package streams.zadania;

public class Person {
    private String name;
    private String surname;
    private int age;
    private float height;
    private String comment;

    public Person(String name, String surname, int age, float height, String comment){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public String getComment() {
        return comment;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
