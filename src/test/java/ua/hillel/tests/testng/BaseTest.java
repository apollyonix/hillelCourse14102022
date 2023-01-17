package ua.hillel.tests.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class BaseTest {
  @BeforeClass
  @Parameters({ "url", "browser"})
  public void setUp(String url, @Optional("firefox") String browser) {
    System.out.println("start browser " + browser);
    System.out.println("open app: " + url);
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() {
    System.out.println("close browser");
  }
}
