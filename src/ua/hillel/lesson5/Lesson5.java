package ua.hillel.lesson5;

import java.util.Arrays;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Lesson5 {
  public static void main(String[] args) {
    String s = null;

    if (s != null && s.contains("java")) {
      System.out.println();
    } else if (true) {

    }


    int i = 3;
    boolean cont = true;

    for (int j = 0; cont;) {
      i += 3;
      if (i> 10) {
        cont = false;
      }
    }


    int[] charArray = new int[10];

    System.out.println(Arrays.toString(charArray));

    String[] sArr = new String[10];
    sArr[0] = "hello";
    sArr[1] = "world";
    System.out.println(Arrays.toString(sArr));

    int[] intArray = {1, 2, 5, 6, 8};
//    System.out.println(Arrays.toString(intArray));

    for (int j=0; j<intArray.length; j++) {
      intArray[j] = j*3;
    }

//    System.out.println(Arrays.toString(intArray));

  }
}
