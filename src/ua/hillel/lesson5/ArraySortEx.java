package ua.hillel.lesson5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ArraySortEx {
  public static void main(String[] args) {
    int[] array = new int[15];
    Random random = new Random();

    for (int i=0; i<array.length; i++) {
      array[i] = random.nextInt(50);
    }

    System.out.println(Arrays.toString(array));

    boolean needSorting = true;
    while (needSorting) {
      needSorting = false;
      for (int i=0; i<array.length-1; i++) {
        if (array[i] < array[i+1]) {
          int tmp = array[i];
          array[i] = array[i+1];
          array[i+1] = tmp;
          needSorting = true;
        }
      }
    }
    System.out.println(Arrays.toString(array));
  }
}
