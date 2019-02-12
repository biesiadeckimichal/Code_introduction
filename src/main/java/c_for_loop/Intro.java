package c_for_loop;

public class Intro {
    public static void main(String[] args) {
        // int i = 1, to jest warunek ktory chcemy aby zostal
        // wykonany przed rozpoczeciem petli, przypisuje sie do I przebiegu petli

        // i < 11, to warunek ktory musi zostac wykonany aby kolejny etap petli sie odbyl
        // czyli warunek kontynuaci petli

        // i++, to to samo co i = i + 1, tzw inkrementacja, jest wykonywana po kazdym
        // przebiegu petli

        // blok instrukcji zwany tez blokiem kodu  jest w {}

        // break point debugger ustawia obok numeru wiersza lewym przyciskiem myszy
        // a nastepnie kolejne kroki puszczam f8

        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        // Jeśli chcemy wielokrotnie wywołać blok kodu, możemy użyć pętli.
        // Kiedy wiemy ile razy chcemy ten kod wywołać, użyjemy pętli for.
        // Składnia to: for, po ktorym w nawiasach wypisujemy trzy instrukcje:
        // - instrukcja wywołana przed pierwszym przebiegiem pętli (deklaracja i przypisanie wartości licznikowi)
        // - warunek następnego przebiegu pętli (łącznie z pierwszym). Czyli ograniczenie na wartości licznika
        // - instrukcja wywołana po każdym przebiegu pętli (modyfikacja wartości licznika).

        // Napiszemy pętlę, która wypisze w konsoli liczby od 1 do 10.
        // Licznikiem będzie zmienna i (standardem jest wybranie tej nazwy jako licznika pętli for),
        // której przypiszemy wartość 1 na starcie. Będziemy wywoływać przebiegi pętli póki i jest mniejsze od 11,
        // a po każdym przebiegu pętli będziemy zwiększać wartość i o 1.
        // i++ to to samo co i = i + 1 (ale też i += 1)
        for (int i = 1; i < 11; i++) {
            System.out.println(i);

        }
    }
}