package ua.hillel.tests.testng;

import org.testng.annotations.*;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class AllMethods {
  @Test
  public void test1() {
    System.out.println("test1");
  }

  @Test
  public void test2() {
    System.out.println("test2");
  }

  @BeforeSuite
  public void beforeSuite() {
    System.out.println("Before suite");
  }

  @BeforeTest
  public void beforeTest() {
    System.out.println("Before test");
  }

  @BeforeClass
  public void beforeClass() {
    System.out.println("Before class");
  }

  @BeforeMethod
  public void beforeMethod() {
    System.out.println("Before method");
  }

  //
  @AfterSuite
  public void afterSuite() {
    System.out.println("After suite");
  }

  @AfterTest
  public void afterTest() {
    System.out.println("After test");
  }

  @AfterSuite
  public void afterClass() {
    System.out.println("After class");
  }

  @AfterMethod
  public void afterMethod() {
    System.out.println("After method");
  }
}
