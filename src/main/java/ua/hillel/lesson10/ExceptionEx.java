package ua.hillel.lesson10;

import java.io.FileNotFoundException;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ExceptionEx {
  public static void main(String[] args) throws InterruptedException, FileNotFoundException {
    ConfigUtil configUtil = new ConfigUtil();
//    try {
//      configUtil.getConfigProperty();
//    } catch (Exception e) {
//      System.out.println("some exception happened");
//    }
//
//
//    System.out.println("before method");
//
//    try {
//      System.out.println("before try");
//      configUtil.methodWithException();
//      System.out.println("after try");
//    } catch (Exception e) {
//      System.out.println("inside catch");
//    }
//
//    System.out.println("after method");


    configUtil.clickButton();
  }
}
