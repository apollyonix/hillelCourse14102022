package ua.hillel.tests.wdTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class FileDownloadTest extends BaseTest {

  @Test
  public void downloadTest() {
    driver.get("https://the-internet.herokuapp.com/download");

    driver.findElement(By.linkText("werty.txt")).click();


    driver.get("https://the-internet.herokuapp.com/upload");
    driver.findElement(By.cssSelector("#file-upload"))
        .sendKeys(new File(("target/downloads/werty.txt")).getAbsolutePath());
    driver.findElement(By.cssSelector("#file-submit")).click();
  }
}
