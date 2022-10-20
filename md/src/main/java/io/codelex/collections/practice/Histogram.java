package main.java.io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "C:\\Users\\karin\\home_exercises\\home_exercises\\md\\src\\main\\resources\\collections\\midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        System.out.println(scores);
    }

    private static String fileContent() throws IOException {
        final Path path = Paths.get(file);
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }
}
