package ua.hillel.lesson5;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class TestExample {
  public static void main(String[] args) {
    boolean flag = true;
    boolean flag2 = true, flag3 = false;
    someMethod();
    int value;
    if (flag) {
      value = (flag2 ? 1 : 2);
    } else {
      value = flag3 ? 3 : 4;
    }
    System.out.println(value);
    someMethod();
  }


  private static void someMethod() {
    System.out.println(1);
    System.out.println(2);
    System.out.println(3);
  }
}
