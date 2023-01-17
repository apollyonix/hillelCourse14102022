package ua.hillel.lesson8;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class FinalExample {
  private int nonFinalValue = 0;
  private final int finaleValue = 1;
  private final int constValue;

  public FinalExample(int value) {
    constValue = value;
  }

  public void changeValue() {
    nonFinalValue++;
  }

  public void nonFinalMethod() {

  }

  public final void finalMethod() {

  }
}
