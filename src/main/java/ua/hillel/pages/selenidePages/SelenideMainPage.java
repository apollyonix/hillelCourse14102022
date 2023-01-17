package ua.hillel.pages.selenidePages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import ua.hillel.pages.LoginPage;

import static com.codeborne.selenide.Selenide.$;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class SelenideMainPage {
  private SelenideElement formLink = $(By.linkText("Form Authentication"));
  private SelenideElement formSubLink = formLink.$("");

  public SelenideLoginPage goToLoginPage() {
    formLink.shouldBe(Condition.visible).click();
    return new SelenideLoginPage();
  }
}
