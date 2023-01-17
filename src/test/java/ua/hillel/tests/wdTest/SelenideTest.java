package ua.hillel.tests.wdTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class SelenideTest {
  @Test
  public void selenideTest() {
    Configuration.baseUrl = "https://the-internet.herokuapp.com/";
//    Configuration.browser = "firefox";
    Configuration.savePageSource = false;


    open("/hovers");

    $(".figure").shouldBe(Condition.visible).shouldHave(Condition.text("test")).uploadFile();
    $$x("//*[@class='figure']");
    $$(By.linkText("link-text")).snapshot().filter(Condition.visible);

    executeJavaScript("");

    System.out.println("done");
  }
}
