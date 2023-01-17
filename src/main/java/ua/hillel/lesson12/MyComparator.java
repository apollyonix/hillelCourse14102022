package ua.hillel.lesson12;

import java.util.Comparator;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class MyComparator implements Comparator<Integer> {
  @Override
  public int compare(Integer num1, Integer num2) {
    if (num1 %2 == 0 && num2 % 2 != 0) return -1;
    if (num1 %2 != 0 && num2 % 2 == 0) return 1;
    return num2.compareTo(num1);
  }
}
