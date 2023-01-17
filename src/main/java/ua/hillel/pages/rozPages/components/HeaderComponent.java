package ua.hillel.pages.rozPages.components;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import ua.hillel.pages.rozPages.MainPage;
import ua.hillel.pages.rozPages.ProductPage;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class HeaderComponent  {
  private WebElement mainIcon;

  private WebElement catalogButton;

  private WebElement searchInput;


  public MainPage goToMainPage() {
    mainIcon.click();
    return new MainPage();
  }

  public ProductPage searchForProduct(String product) {
    searchInput.sendKeys(product + Keys.ENTER);
    return new ProductPage();
  }

  public void openCatalog() {
    catalogButton.click();
  }
}
