package ua.hillel.lesson13;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class StreamApiEx {
  public static void main(String[] args) {
    List<String> inputList = Arrays.asList("1", "", "3", "", "6");

    List<String> newList = new LinkedList<>();
    for (String input : inputList) {
      if (!input.isEmpty()) {
        newList.add(input);
      }
    }

    List<Integer> intList = new LinkedList<>();
    for (String s : newList) {
      intList.add(Integer.parseInt(s));
    }

    int sum = 0;
    for (int i : intList) {
      sum += i;
    }

    System.out.println(sum);


//    int streamSum = inputList.stream().filter(s -> !s.isEmpty()).mapToInt(Integer::parseInt).sum();
//    System.out.println(streamSum);

    List<Integer> streamList = inputList.stream().filter(s -> !s.isEmpty()).map(Integer::parseInt).collect(Collectors.toList());


    int optional = inputList.stream().filter(s -> !s.isEmpty()).map(Integer::parseInt).findFirst().get();
//    if (optional.isPresent()) {
//      int value = optional.get();
//    }


  }
}
