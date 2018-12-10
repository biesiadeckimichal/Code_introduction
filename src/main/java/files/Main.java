package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
//        readExample();
//        writeExample();
        Path filePath = Paths.get("file.txt");
        // Metoda sprawdza, czy ścieżka wskazuje na plik
        System.out.println(Files.isRegularFile(filePath));

        Path directoryPath = Paths.get("src");
        // Metoda sprawdza, czy ścieżka wskazuje na katalog
        System.out.println(Files.isDirectory(directoryPath));

        // Metoda tworzy plik
        Path newFilePath = Paths.get("newFile.txt");
        Files.createFile(newFilePath);

    }

    private static void writeExample() throws IOException {
        List<String> fileLines = Arrays.asList(
                "wiersz 1", "wiersz 2", "wiersz 3");
        Path path = Paths.get("file.txt");
        // Metoda zapisuje linie do pliku:
        Files.write(path, fileLines);
        Files.write(path, fileLines, StandardOpenOption.APPEND);
        // Jeśli chcemy dopisać linie możemy użyć:
        // Files.write(path, fileLines, StandardOpenOption.APPEND);
    }

    private static void readExample() throws IOException {
        // uzywamy metody statycznej get z klasy Paths
        // tworzymy obiekt ktory reprezentuje sciezke wzgledna
        // wzgledna oznacza ze plik trafi do naszego folderu z projektem
        // jesli bysmy stworzyli sciezke bezwzgledna np c:\plik, to trafilby tam
        // prawym na pierwszy folder drzewka projektu new -> file
        Path path = Paths.get("file.txt");
        // uzywamy metody statycznej z klasy files
        // tworzymy liste "lini"
        // Metoda odczytuje wszystkie linie z pliku
        List<String> fileLines = Files.readAllLines(path);
        for (String fileLine : fileLines) {
            System.out.println(fileLine);
        }
    }
}
