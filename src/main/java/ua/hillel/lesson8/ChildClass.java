package ua.hillel.lesson8;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ChildClass extends FinalExample {
  public ChildClass() {
    super(1);
  }

  @Override
  public void nonFinalMethod() {

  }

  public void finalMethod(String newValue) {
  }
}
