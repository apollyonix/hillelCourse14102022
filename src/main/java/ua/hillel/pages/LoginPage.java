package ua.hillel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v108.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class LoginPage extends BasePage {
  @FindBy(id = "username")
  private WebElement usernameInput;

  @FindBy(id = "password")
  private WebElement passwordInput;

  @FindBy(css = "button[type='submit']")
  private WebElement loginButton;

  @FindBy(css = ".flash.error")
  private WebElement errorPopup;

  public LoginPage() {
    PageFactory.initElements(driver, this);
  }

  public LoginPage setUsername(String username) {
    setText(usernameInput, username);
    return this;
  }

  public LoginPage setPassword(String password) {
    setText(passwordInput, password);
    return this;
  }

  public SecurePage clickLoginButton() {
    clickButton(loginButton);
    return new SecurePage();
  }

  public SecurePage login(String username, String password) {
    setUsername(username);
    setPassword(password);
    return clickLoginButton();
  }

  public LoginPage loginWithInvalidCreds(String username, String password) {
    setUsername(username);
    setPassword(password);
    clickLoginButton();

    return new LoginPage();
  }
}
