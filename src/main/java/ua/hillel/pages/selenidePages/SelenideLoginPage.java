package ua.hillel.pages.selenidePages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class SelenideLoginPage {
  private SelenideElement usernameInput = $("#username");
  private SelenideElement passwordInput = $("#password");
  private SelenideElement loginButton = $("button[type='submit']");

  public SelenideLoginPage setUsername(String username) {
    usernameInput.shouldBe(Condition.visible).sendKeys(username);
    return this;
  }

  public SelenideLoginPage setPassword(String password) {
    passwordInput.shouldBe(Condition.visible).sendKeys(password);
    return this;
  }

  public SelenideSecurePage clickLoginButton() {
    loginButton.shouldBe(Condition.visible).shouldBe(Condition.enabled).click();
    return new SelenideSecurePage();
  }
}
