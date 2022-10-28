package ua.hillel.lesson4;

import java.util.Arrays;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ArrayExample {
  public static void main(String[] args) {
//    int i = 0;
    int[] intArray = new int[5];
//    System.out.println(Arrays.toString(intArray));

    String[] strArray = new String[5];
//    System.out.println(Arrays.toString(strArray));

    double[] doArr = {1.2, 3.4, 5.6, 7.8};
    System.out.println(Arrays.toString(doArr));

//    System.out.println(doArr[2]);

    doArr[2] = 8.111;
//    System.out.println(doArr[2]);

    for (int i=0; i<doArr.length; i++) {
//      System.out.println(doArr[i]);
    }

    for (double d : doArr) {
      d = d+5;
      System.out.println(d);
    }

    System.out.println(Arrays.toString(doArr));

    System.out.println(doArr[10]);
  }
}
