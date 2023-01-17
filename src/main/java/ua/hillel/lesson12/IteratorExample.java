package ua.hillel.lesson12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class IteratorExample {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("one", "", "two", "", "", "three");
    List<String> newList = new ArrayList();
    newList.addAll(list);

//    for (String s : newList) {
//      if (s.isEmpty()) {
//        newList.remove(s);
//      }
//    }

    Iterator<String> iterator = newList.iterator();
    while (iterator.hasNext()) {
      String s = iterator.next();
      if (s.isEmpty()) {
        iterator.remove();
      }
    }



//    System.out.println(newList);



    List<String> dataValues = Arrays.asList("Name", "Jon", "Lastname", "Snow", "Workplace", "The Wall");

    Iterator<String> dataValuesIterator = dataValues.iterator();
    String value = "";
    while (dataValuesIterator.hasNext()) {
      if (dataValuesIterator.next().equals("Workplace")) {
        value = dataValuesIterator.next();
      }
    }
    System.out.println(value);
  }
}
