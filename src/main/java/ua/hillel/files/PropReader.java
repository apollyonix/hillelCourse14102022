package ua.hillel.files;

import org.openqa.selenium.devtools.v85.io.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class PropReader {
  public static void main(String[] args) throws IOException {
    Properties properties = new Properties();
    properties.load(new FileReader(new File("files/test.properties")));

    System.out.println(properties.get("url"));
    System.out.println(properties.get("pass"));
  }
}
