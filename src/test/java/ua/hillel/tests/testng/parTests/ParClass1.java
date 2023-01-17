package ua.hillel.tests.testng.parTests;

import org.testng.annotations.Test;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ParClass1 {
  @Test
  public void parTest1() {
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {}
    System.out.println("test 1");
  }
}
