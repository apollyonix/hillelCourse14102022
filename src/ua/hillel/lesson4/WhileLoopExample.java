package ua.hillel.lesson4;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class WhileLoopExample {
  public static void main(String[] args) {
    int count = 0;

    int innerCount = 0;


    while (count < 5) {
      System.out.println(count);
      while (innerCount<10) {
        System.out.println(innerCount);
        if (innerCount==5) {
          break;
        }
        innerCount++;
      }
      count++;
    }

  }
}
