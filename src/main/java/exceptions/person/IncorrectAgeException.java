package exceptions.person;

public class IncorrectAgeException extends Exception {
    // throwable dzieli sie exception i error
    // zawsze errory obslugujemy przez throwable, a wiec mozemy tu uzyc exception
    // ktore dziedziczy po throwable, errora nie stosujemy bo dotyczy maszyny
    // ktora uzywa programu, a nas interesuje program
    // zawsze przy obsludze erroru musimy zadeklarowac ktores z powyzszych
    // zazwyczaj exception
    // String message nie jest deklarowane, bo dziedziczymy po czyms tam, super
    private int age;

    public IncorrectAgeException(String message, int age) {
        super(message);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
