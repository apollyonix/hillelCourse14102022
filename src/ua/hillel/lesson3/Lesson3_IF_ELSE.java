package ua.hillel.lesson3;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Lesson3_IF_ELSE {
  public static void main(String[] args) {
//    System.out.println("Before IF");
//
//    if (false) {
//      System.out.println("Inside IF");
//    } else {
//      System.out.println("Before ELSE");
//    }

//    System.out.println("After IF");





    boolean b1 = true, b2 = false, b3 = true;

//    if (b1) {
//      System.out.println("If 1");
//    } else if (b2) {
//      System.out.println("If 2");
//    } else if (b3) {
//      System.out.println("If 3");
//    } else {
//      System.out.println("Else");
//    }


    if (b1) {
      System.out.println("If 1");
      if (b2) {
        System.out.println("If 2");
        if (b3) {
          System.out.println("If 3");
        }
      } else {
        System.out.println("Else 2");
      }
    }

  }
}
