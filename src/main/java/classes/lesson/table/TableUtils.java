package classes.lesson.table;

public class TableUtils {
    // typ metody to Table poniewaz tworzymy obiekt typu table
    // mowimy tu o metodach static
    // jesli nie wpiszemy ani private ani public to domyslnie jest package domyslnie
    private static Table createSmalltable() {
        return new Table(80,50,40);
    }
}
