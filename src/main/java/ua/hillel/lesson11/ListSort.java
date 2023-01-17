package ua.hillel.lesson11;

import java.util.*;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ListSort {
  public static void main(String[] args) {
    List<Integer> inputList = new LinkedList<>();
    Random random = new Random();
    for (int i=0; i<100; i++) {
      inputList.add(random.nextInt(20000));
    }

    //+1
    List<Integer> arrayList = new ArrayList<>(inputList);
    long start = System.currentTimeMillis();
    sortList(arrayList);
    long stop = System.currentTimeMillis();
    System.out.println("Sorted array list in " + (stop - start) + " ms");


    //+2
    List<Integer> linkedList = new LinkedList<>(inputList);
    start = System.currentTimeMillis();
    sortList(linkedList);
    stop = System.currentTimeMillis();
    System.out.println("Sorted linked list in " + (stop - start) + " ms");


    start = System.currentTimeMillis();
    Collections.sort(inputList);
    stop = System.currentTimeMillis();
    System.out.println("Sorted list by native method in " + (stop - start) + " ms");

  }

  private static void sortList(List<Integer> list) {
    boolean needSorting = true;
    while (needSorting) {
      needSorting = false;
      for (int i=0; i<list.size()-1; i++) {
        if (list.get(i) > list.get(i+1)) {
          int temp = list.get(i);
          list.set(i, list.get(i+1));
          list.set(i+1, temp);
          needSorting = true;
        }
      }
    }
  }
}
