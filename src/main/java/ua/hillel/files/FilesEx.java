package ua.hillel.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class FilesEx {
  public static void main(String[] args) throws IOException {
    File file = new File("files/testfile.txt");

//    file.deleteOnExit();

    List<String> lines  = Files.readAllLines(file.toPath());
    System.out.println(lines);


    lines = new ArrayList<>();
    lines.add("test line 1");
    lines.add("test line 2");
    lines.add("test line 3");


    Files.write(file.toPath(), lines);
  }
}
