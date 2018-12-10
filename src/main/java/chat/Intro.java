package chat;

public class Intro {
    public static void main(String[] args) {
        // typ char to typ liczbowy (zakres 0 - 65535), często używany do reprezentowania znaku
        // zadeklarujemy zmienną typu char
        char myChar;
        myChar = 97;

        // lancuchy znakow piszemy w "", natomiast znaki w ''
        System.out.println(myChar == 'a');
        String myString = "ABCDEF";

        // myString jest klasa natomiast chartAt jest mteoda klasy myString
        System.out.println(myString.charAt(2));
        System.out.println("XYZ".charAt(2));

        // typ char to typ liczbowy (zakres 0 - 65535), często używany do reprezentowania znaku
        // zadeklarujemy zmienną typu char
        // przypiszemy jej wartość
        myChar = 97;
        // Wypiszemy watrość zmiennej (wypisany zostanie znak a)
        System.out.println(myChar);
        // Wartość 'a' i 97 to dokładnie to samo
        // Możemy podejrzeć wartości znaków googlując ascii table
        System.out.println(myChar == 'a');

        // Pobierzemy z łańcucha znaków znak na wybranym miejscu.
        //indeksy znaków:  012345
        myString = "ABCDEF";
        // Wybierzemy znak o indeksie 2
        System.out.println(myString.charAt(2));
        System.out.println("XYZ".charAt(2));

        // Wartość znaku to liczba, więc możemy ją równie dobrze przypisać
        // do zmiennej typu int.
        int myInt = 'b';
        System.out.println(myInt);

        // ASCII table
        // lancuchy znakow piszemy w "", natomiast znaki w ''
        myString = "ABCDEF";

        // myString jest klasa natomiast chartAt jest mteoda klasy myString
        System.out.println(myString.charAt(2));
        System.out.println("XYZ".charAt(2));

    }
}
