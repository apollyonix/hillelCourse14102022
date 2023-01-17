package ua.hillel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class SecurePage extends BasePage {
//  private By byLogout = By.cssSelector("a.radius");
//  private By byPageName = By.tagName("h2");

  @FindBy(css = "a.radius")
  private WebElement logoutButton;

  @FindBy(tagName = "h2")
  private WebElement pageName;

  @FindBy(xpath = "//p")
  private List<WebElement> listOfElements;


  public SecurePage() {
    PageFactory.initElements(driver, this);
  }

  public LoginPage logout() {
    logoutButton.click();
    return new LoginPage();
  }

  public String getPageName() {
    return pageName.getText();
  }
}
