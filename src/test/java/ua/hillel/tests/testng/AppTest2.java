package ua.hillel.tests.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class AppTest2 extends BaseTest {
  @Test
  public void appTest() {
    System.out.println("run test");
  }

}
