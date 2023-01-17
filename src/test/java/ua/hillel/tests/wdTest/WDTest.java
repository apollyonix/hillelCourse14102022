package ua.hillel.tests.wdTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class WDTest {
  @Test
  public void wdTest(String browser) {
    WebDriver driver;
    if (browser.equalsIgnoreCase("chrome")) {
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
    } else {
      WebDriverManager.firefoxdriver().setup();
      driver = new FirefoxDriver();
    }
    driver.get("https://google.com");


    driver.findElement(By.id("page-footer"));


    System.out.println(driver.getTitle());

    driver.quit();
  }
}
