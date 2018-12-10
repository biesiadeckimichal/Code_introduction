package files.zadania;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class zadanie1 {
    public static void main(String[] args) throws IOException {
        writeFile();
        printFile("dane.txt");

    }

    private static void writeFile() throws IOException {
        List<String> fileLines = Arrays.asList(
                "linia 1",
                "linia 2",
                "linia 3"
                );
        Path path = Paths.get("dane.txt");
        Files.write(path, fileLines);
    }

    private static boolean printFile(String filename) throws IOException {
        Path path = Paths.get(filename);
        List<String> fileLines;
        try {
            fileLines = Files.readAllLines(path);
        } catch (Exception e) {
            System.out.println("plik nie istnieje");
            return false;
        }
        for (String fileLine : fileLines) {
            System.out.println(fileLine);
        }
        return true;
    }

}
