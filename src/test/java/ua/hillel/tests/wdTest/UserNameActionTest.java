package ua.hillel.tests.wdTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class UserNameActionTest extends BaseTest {
  @Test
  public void userNameTest() {
    driver.get("https://the-internet.herokuapp.com/hovers");

    List<WebElement> userEls = driver.findElements(By.cssSelector(".figure"));
    Actions actions = new Actions(driver);

    for (WebElement userEl : userEls) {
      actions.moveToElement(userEl).perform();
      String userText = userEl.findElement(By.tagName("h5")).getText();
      System.out.println(userText.replace("name: ", ""));
    }

  }
}
