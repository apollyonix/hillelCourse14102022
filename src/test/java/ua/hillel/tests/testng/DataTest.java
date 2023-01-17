package ua.hillel.tests.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class DataTest {
  @Test(dataProvider = "userData")
  public void dataTest(String user, String pass, int email) {
      System.out.println("running test for " + user);
      if (user.equals("admin")) {
        Assert.assertEquals(user, "5", "User value is incorrect");
      }

      SoftAssert softAssert = new SoftAssert();
      softAssert.assertEquals("f", "s");
      softAssert.assertEquals("f", "s");
      softAssert.assertEquals("f", "s");
      softAssert.assertEquals("f", "s");
      softAssert.assertEquals("f", "s");



      softAssert.assertAll();

  }

  @DataProvider(name = "userData")
  public Object[][] userDataProvider() {
    Object[][] result = {
        {"admin", "adminPass", true},
        {"user", "userPass", "user@mail.com"},
        {"guest", "guestPass", "guest@mail.com"}
    };

    return result;
  }
}
