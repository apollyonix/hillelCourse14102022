package ua.hillel.lesson4;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class LoopForExample {
  public static void main(String[] args) {
    System.out.println("Before LOOP");

    boolean flag1 = true, flag2 = true, flag3 = false;


    for (int count = 5 ; count<=10; count++) {
      System.out.println("i= " + count);
    }

    System.out.println("After LOOP");
  }
}
