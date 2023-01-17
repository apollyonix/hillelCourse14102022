package ua.hillel.lesson8;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class StaticExample {
  public int nonStaticValue = 0;
  public static int staticValue = 1;


  public int getNonStaticValue() {
    return nonStaticValue;
  }

  public static int getStaticValue() {
    return staticValue;
  }
}
