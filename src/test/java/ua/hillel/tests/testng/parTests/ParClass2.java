package ua.hillel.tests.testng.parTests;

import org.testng.annotations.Test;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ParClass2 {
  @Test
  public void parTest2() {
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {}
    System.out.println("test 2");
  }
}
