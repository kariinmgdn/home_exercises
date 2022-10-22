package io.codelex.fileIO;

import java.io.*;
import java.net.URISyntaxException;

public class FileIO {

    private static final String PATH = "C:\\Users\\karin\\home_exercises\\home_exercises\\md\\src\\main\\java\\io\\codelex\\fileIO\\";

    public static void main(String[] args) throws IOException, URISyntaxException {
        StringBuffer title = new StringBuffer("lear");
        BufferedReader in = new BufferedReader(new FileReader(PATH + title + ".txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter(PATH + reverseTitle(title)));

        String line;
        StringBuilder allLines = new StringBuilder();
        while ((line = in.readLine()) != null) {
            allLines.append(line).append("\n");
        }
        out.write(allLines.reverse().toString());
        in.close();
        out.close();
    }

    private static StringBuffer reverseTitle(StringBuffer title) {
        return title.reverse().append(".txt");
    }
}
