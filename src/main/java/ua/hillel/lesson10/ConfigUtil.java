package ua.hillel.lesson10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Random;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ConfigUtil {
  public void getConfigProperty() throws FileNotFoundException, InterruptedException {
    try {
//      File configFile = new File("config.json");
//      FileReader reader = new FileReader(configFile);
      Thread.sleep(1000);
    } finally {
      System.out.println("inside finally");
    }
    }


  public void methodWithException() {
    Random random = new Random();
    int a = random.nextInt(6) % 2;

//    System.out.println(2/a);
  }


  public void getDatabaseValue() {
    try(Connection connection = DriverManager.getConnection("")) {
      connection.createStatement();
    } catch (SQLException e) {}

  }


  public void clickButton() {

    throw new ButtonNotFoundException("Admin page", "Create new user");
  }
}
