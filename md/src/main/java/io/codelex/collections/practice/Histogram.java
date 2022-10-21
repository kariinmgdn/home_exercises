package main.java.io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "C:\\Users\\karin\\home_exercises\\home_exercises\\md\\src\\main\\resources\\collections\\midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        List<Integer> intScores = Arrays.stream(scores.split(" ")).map(Integer::parseInt).toList();
        for (int i = 0; i <= 100; i += 10) {
            int max = i + 9;
            int count = 0;
            for (Integer score : intScores) {
                if (score <= max && score >= i) {
                    count++;
                }
            }
            String output = String.format("%02d", i) + "-" + String.format("%02d", max) + ": " + "*".repeat(count);
            if (i == 100) {
                output = "  100: " + "*".repeat(count);
            }
            System.out.println(output);
        }

    }

    private static String fileContent() throws IOException {
        final Path path = Paths.get(file);
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }
}
