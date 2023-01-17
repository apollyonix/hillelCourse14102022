package ua.hillel.tests.wdTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ua.hillel.pages.MainPage;
import ua.hillel.utils.DriverHolder;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class BaseTest {
  protected WebDriver driver;

  @BeforeClass
  public void setUp() {
    WebDriverManager.chromedriver().setup();

    ChromeOptions options = new ChromeOptions();
    Map<String, Object> prefs = new HashMap<String, Object>();
    prefs.put("download.default_directory", new File("target/downloads/").getAbsolutePath());
    options.setExperimentalOption("prefs", prefs);

    this.driver = new ChromeDriver(options);

    driver.manage().window().maximize();
    DriverHolder.setDriver(driver);
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }

  public MainPage openMainPage() {
    driver.get("https://the-internet.herokuapp.com/");
    return new MainPage();
  }
}
