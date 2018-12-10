package exceptions.powtorka;

public class IncorrectAgeException extends Exception {
    private int age;

    public IncorrectAgeException(String message, int age) {
        super(message);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
