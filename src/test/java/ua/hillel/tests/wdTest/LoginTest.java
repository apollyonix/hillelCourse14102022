package ua.hillel.tests.wdTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class LoginTest {
  @Test
  public void loginTest() {
    WebDriverManager.chromedriver().setup();

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://the-internet.herokuapp.com/");

    driver.findElement(By.linkText("Form Authentication")).click();

    driver.findElement(By.id("username")).sendKeys("tomsmith");
    driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

    driver.findElement(By.cssSelector("button[type='submit']")).click();

    String text = driver.findElement(By.tagName("h2")).getText();
    Assert.assertTrue(text.contains("Secure Area"));

    driver.quit();
  }
}
