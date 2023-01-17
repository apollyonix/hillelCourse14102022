package ua.hillel.tests.wdTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class JsTest {
  @Test
  public void jsTest() {
    WebDriverManager.chromedriver().setup();

    WebDriver driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/");

    WebElement link = driver.findElement(By.linkText("WYSIWYG Editor"));

    JavascriptExecutor executor = (JavascriptExecutor) driver;
//    executor.executeScript("arguments[0].click()", link);

    executor.executeScript("arguments[0].scrollIntoView(true)", link);

    driver.quit();
  }
}
