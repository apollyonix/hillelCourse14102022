package ua.hillel.tests.wdTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class SelectTest {
  @Test
  public void selectTest() {
    WebDriverManager.chromedriver().setup();

    WebDriver driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/dropdown");

    WebElement selectEl = driver.findElement(By.tagName("select"));

    Select select = new Select(selectEl);

    List<String> values = select.getAllSelectedOptions().stream().map(WebElement::getText).toList();

    System.out.println(values);

    select.selectByValue("2");


    driver.quit();
  }
}
