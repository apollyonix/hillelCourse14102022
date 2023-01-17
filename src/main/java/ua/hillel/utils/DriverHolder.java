package ua.hillel.utils;

import org.openqa.selenium.WebDriver;

import java.io.DataInput;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class DriverHolder {
  private static DriverHolder instance;

  private WebDriver driver;

  private DriverHolder(){}

  public static DriverHolder getInstance() {
    if (instance == null) {
      instance = new DriverHolder();
    }
    return instance;
  }

  public static WebDriver getDriver() {
    return getInstance().driver;
  }

  public static void setDriver(WebDriver driver) {
    getInstance().driver = driver;
  }
}
