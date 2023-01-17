package ua.hillel.lesson9;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class MethodLocalClassEx {
  public void someMethod() {

    class LocalClass {
      String f1;
      String f2;
      double f3;

      public void localMethod1() {
      }
    }

    LocalClass localClass = new LocalClass();
  }

  public void anotherMethod() {

  }
}
