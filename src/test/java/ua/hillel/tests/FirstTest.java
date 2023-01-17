package ua.hillel.tests;

import org.testng.annotations.Test;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class FirstTest {
  @Test(priority = 10)
  public void firstTest() {
    System.out.println("I'm test");

    System.out.println("Running test on " + System.getProperty("url"));
  }

  @Test(priority = 11, dependsOnMethods = "firstTest")
  public void firstTest2() {
    System.out.println("I'm test - 2");

    System.out.println("Running test on " + System.getProperty("url"));
  }


  public void test1() {}

//  @Test(priority = 30)
  public void test2() {}
}
