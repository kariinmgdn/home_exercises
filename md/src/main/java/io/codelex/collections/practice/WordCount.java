package main.java.io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "C:\\Users\\karin\\home_exercises\\home_exercises\\md\\src\\main\\resources\\collections\\lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(file);
        Files.readAllLines(path, charset);

        int lines = 0;
        int words = 0;
        int characters = 0;

        for (String line : Files.readAllLines(path, charset)) {
            lines++;
            characters += line.length();

            String[] arrayOfWords = line.split("[!?,.' ]");
            for (String word : arrayOfWords) {
                if (!word.matches("[ ]*")) {
                    words++;
                }
            }
        }

        System.out.println("Lines: " + lines + "\nWords: " + words + "\nChars: " + characters);

    }
}
