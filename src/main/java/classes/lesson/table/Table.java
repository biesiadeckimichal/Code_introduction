package classes.lesson.table;

public class Table {
    // modyfikatorem dostepu jest tu slowo public
    // mamy modyfikator public i private
    // modyfikator public jest widziana wszedzie, kazda klasa moze z niego skorzystac
    // wszedzie gdzie uzywam typu Table
    // modyfikator private oznacza ze do pol moge sie tylko odwolywac wewnatrz
    // danej klasy
    public int width;
    public int height;
    public int depth;

    // tworzymy konstruktor, dane w nawiasach musza nam sluzyc do tworzenia obiektu;
    // konstruktor to taka klasa/metoda sluzaca do tworzenia obiektu
    public Table(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}
