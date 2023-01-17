package ua.hillel.tests.wdTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.pages.LoginPage;
import ua.hillel.pages.MainPage;
import ua.hillel.pages.SecurePage;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class LoginTestPO extends BaseTest {
  @Test
  public void loginTest() {

    SecurePage securePage = openMainPage().goToLoginPage()
        .setUsername("tomsmith")
        .setPassword("SuperSecretPassword!")
        .clickLoginButton();


    String text = securePage.getPageName();
    Assert.assertTrue(text.contains("Secure Area"));
  }
}
