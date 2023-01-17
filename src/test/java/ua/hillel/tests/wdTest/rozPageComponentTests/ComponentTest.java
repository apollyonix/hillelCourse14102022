package ua.hillel.tests.wdTest.rozPageComponentTests;

import org.testng.annotations.Test;
import ua.hillel.pages.rozPages.MainPage;
import ua.hillel.pages.rozPages.ProductPage;
import ua.hillel.tests.wdTest.BaseTest;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ComponentTest extends BaseTest {
  @Test
  public void componentTest() {
    MainPage mainPage = new MainPage();
    mainPage.getLastViewedProducts();

    mainPage.header.searchForProduct("Product");

    ProductPage productPage = new ProductPage();
    productPage.header.goToMainPage();
  }
}
