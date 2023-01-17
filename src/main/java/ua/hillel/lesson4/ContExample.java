package ua.hillel.lesson4;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ContExample {
  public static void main(String[] args) {
    for (int i=2; i>-3; i--) {
      if (i==0) {
        continue;
      }
      System.out.println(5/i);
    }
  }
}
