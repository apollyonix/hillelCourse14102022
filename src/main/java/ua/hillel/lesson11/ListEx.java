package ua.hillel.lesson11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ListEx {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(1);
    list.add(1);
    list.add(1);
    list.add(2);
    list.add(2);
    list.add(2);

    System.out.println(list.size());
    System.out.println(list);

    System.out.println(list.get(2));
    list.set(1, 4);
    System.out.println(list);

    list.remove(4);
    System.out.println(list);



  }
}
