package ua.hillel.tests.wdTest;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.pages.selenidePages.SelenideMainPage;

import static com.codeborne.selenide.Selenide.open;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class SelenideLoginTest {
  @Test
  public void loginTest() {

    open("https://the-internet.herokuapp.com/");

    String pageText = new SelenideMainPage().goToLoginPage()
        .setUsername("tomsmith")
        .setPassword("SuperSecretPassword!")
        .clickLoginButton()
        .getPageName();

    Assert.assertTrue(pageText.contains("Secure Area"));
  }
}
