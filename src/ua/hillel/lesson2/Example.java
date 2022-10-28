package ua.hillel.lesson2;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Example {
  public static void main(String[] args) {
    System.out.println("ex1");


    int a = 1;
    System.out.println("" + a++ + "");
    System.out.println("" + ++a + "");

    int i = 0;
    Integer i2 = 0;

    System.out.println(i2);

    byte b = 1;
    int ii = 2;
    long l = 500;

    long result = b + ii + l;

    double d = b * 1.0;
    byte intResult = (byte) (b + ii + l);

    System.out.println(intResult);
  }
}
