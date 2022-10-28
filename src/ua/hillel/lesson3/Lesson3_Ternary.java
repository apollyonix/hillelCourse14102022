package ua.hillel.lesson3;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Lesson3_Ternary {
  public static void main(String[] args) {
    boolean flag = false;

    boolean innerFlag = false;


    String value = flag ? getValue1() : getValue2();

    String value2;
    if (flag) {
      value2 = getValue1();
    } else {
      value2 = getValue2();
    }


//    String value2;
//    if (flag) {
//      if (innerFlag) {
//        value2 = getValue1();
//      } else {
//        value2 = getValue2();
//      }
//    } else {
//      value2 = getValue3();
//    }

    System.out.println(value);


  }

  private static String getValue1 () {
    return "tr";
  }

  private static String getValue2() {
    return "ue";
  }

  private static String getValue3() {
    return "false";
  }
}
