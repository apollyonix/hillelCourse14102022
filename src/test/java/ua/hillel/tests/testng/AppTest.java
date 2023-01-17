package ua.hillel.tests.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class AppTest {
  @BeforeClass
  public void setUp() {
    System.out.println("start browser");
  }

  @Test
  public void appTest() {
    System.out.println("run test");
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() {
    System.out.println("close browser");
  }


}
