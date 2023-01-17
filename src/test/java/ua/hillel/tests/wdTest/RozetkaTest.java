package ua.hillel.tests.wdTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class RozetkaTest {
  private WebDriver driver;
  private WebDriverWait wait;
  @Test
  public void rozetkaTest() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    driver.manage().window().maximize();

    driver.get("https://rozetka.com.ua/");

    driver.findElement(By.id("fat-menu")).click();

    Actions actions = new Actions(driver);
    List<WebElement> menuItems = driver.findElements(By.cssSelector(".menu-categories__item"));
    for (WebElement item : menuItems) {
      if (item.getText().equals("Товари для геймерів")) {
        actions.moveToElement(item).perform();
        break;
      }
    }

    driver.findElement(By.partialLinkText("Відеокарти")).click();

    //Set filters
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[data-id='Rozetka']"))).click();
    wait.until(ExpectedConditions.not(ExpectedConditions.attributeContains(By.tagName("aside"), "class", "preloader_type_element")));

    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[data-id='ASUS']"))).click();
    wait.until(ExpectedConditions.not(ExpectedConditions.attributeContains(By.tagName("aside"), "class", "preloader_type_element")));

    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[data-id='GeForce RTX 4090']"))).click();
    wait.until(filterIsUnblocked());


    //Open filtered item
    List<WebElement> cards = driver.findElements(By.cssSelector("li.catalog-grid__cell"));

    for (WebElement card : cards) {
      String avail = card.findElement(By.cssSelector(".goods-tile__availability")).getText();
      if (avail.equals("Є в наявності")) {
        card.click();
        break;
      }
    }

    //go to details
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".tabs__list")));
    driver.findElements(By.cssSelector(".tabs__item")).stream().filter(a -> a.getText().contains("Характеристики")).findFirst().get().click();

    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//main/rz-product-characteristics-list")));

    List<WebElement> chars = wait.until(ExpectedConditions.presenceOfNestedElementsLocatedBy(By.cssSelector(".characteristics-full__list"),
                                                                                                       By.cssSelector("div.characteristics-full__item")));

//    List<WebElement> chars = driver.findElements(By.cssSelector(".characteristics-full__item"));


    for (WebElement ch : chars) {
      FluentWait<WebElement> fluentWait = new FluentWait<>(ch)
          .pollingEvery(Duration.ofMillis(200))
          .withTimeout(Duration.ofSeconds(5))
          .ignoring(StaleElementReferenceException.class)
          .ignoring(NoSuchElementException.class);

      String charName = fluentWait.until(c -> c.findElement(By.tagName("dt"))).getText();
      String charValue = fluentWait.until(c -> c.findElement(By.tagName("dd"))).getText();

      System.out.printf("%s: %s%n", charName, charValue);
    }
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }

  private ExpectedCondition<Boolean> filterIsUnblocked() {

    /*
    return new ExpectedCondition<Boolean>() {
      @Override
      public Boolean apply(WebDriver driver) {
        WebElement filterSection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("aside")));
        return !filterSection.getAttribute("class").contains("preloader_type_element");
      }
    };
     */

    return driver -> {
      WebElement filterSection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("aside")));
      return !filterSection.getAttribute("class").contains("preloader_type_element");
    };
  }
}
