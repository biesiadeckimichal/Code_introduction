// foldere w ktorym znajduje sie klasas
package classes.lesson;

// jesli klasa z ktorej korzystam w innej klasie znajduje sie w tym samym folderze
// to nie musimy deklarowac package
// nazwy pakietow piszemy razem mojpakiet bez cammel case
// nazwe pakietow zaczynam od nazwy domeny pisanej od konca
// pakiety sluza do grupowania klas
// jesli probuje uzyc klase znajdujaca sie w innym pakiecie, intell od razu
// podpowiada uzycie importu, jesli tak sie nie stanie uzywam na danej klasie
// alt + enter
// mamy trzy modyfikatory
// private tylko w danej klasie
// public dostepny z kazdego miejsca (ale konieczny jest import)
// package domyslny pojawia sie w momencie gdy nic nie wpiszemy, dostepny tylko
// w danym pakiecie

import classes.lesson.table.Table;

public class Modifiers {
    public static void main(String[] args) {
        // tworze obiekt na podstawie klasy sluzacej do tworzenia obiektow
        // wykorzystuje tu metode czyli konstruktor ktory przygotowalem wczesniej
        Table smallTable = new Table(80,60,40);
        smallTable.depth = 50;

        // piszemy tu mojpakiet.table.TableUtils.createSmalltable poniewaz odwolujemy sie do metody ktora znajduje sie w innej klasie
//        Table otherSmallTable = TableUtils.createSmalltable()
    }
}
