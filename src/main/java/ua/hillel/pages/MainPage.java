package ua.hillel.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class MainPage extends BasePage {
  @FindBy(linkText = "Form Authentication")
  private WebElement formAuthLink;



  public MainPage() {
    PageFactory.initElements(driver, this);
  }

  public LoginPage goToLoginPage() {
    clickButton(formAuthLink);
    return new LoginPage();
  }
}
