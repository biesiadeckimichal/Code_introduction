package files.powtorka;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        // writeExample();
        readExample();
        // Path filePath = Paths.get("file.txt");
        // System.out.println(Files.isRegularFile(filePath));
        //
        // Path directoryPath = Paths.get("src");
        // System.out.println(Files.isDirectory(directoryPath));
        //
        // Path newFilePath = Paths.get("nextNewFile.txt");
        // Files.createFile(newFilePath);
    }

    private static void writeExample() throws IOException {
        List<String> fileLines = Arrays.asList("wiersz11", "wiersz22", "wiersz33");
        Path path = Paths.get("file.txt");
        Files.write(path, fileLines, StandardOpenOption.APPEND);
    }

    private static void readExample() throws IOException {
        Path path = Paths.get("file.txt");
        List<String> fileLines = Files.readAllLines(path);
        for (String fileLine: fileLines) {
            System.out.println(fileLine);
        }
    }


}
