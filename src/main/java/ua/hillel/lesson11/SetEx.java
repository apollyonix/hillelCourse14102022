package ua.hillel.lesson11;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class SetEx {
  public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(1);
    set.add(1);

//    System.out.println(set.size());


    Set<String> stringSet = new TreeSet<>();
    stringSet.add("java");
    stringSet.add("automation");
    stringSet.add("test");
    stringSet.add("api");

    for (String s : stringSet) {
      System.out.println(s);
    }

  }
}
