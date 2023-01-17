package ua.hillel.lesson3;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Lesson3_IF {
  public static void main(String[] args) {
    System.out.println("Before IF");


//    boolean b1 = true, b2 = false, b3=true;

    String strValue = new Lesson3_IF().getStringValue();
    String innerValue = "";

    if (strValue != null && !strValue.isEmpty()) {
      innerValue = "inner";
      System.out.println("Inside IF");
    }

    System.out.println(innerValue);

//    System.out.println("Inside IF 2");

    System.out.println("After IF");
  }


  private String getStringValue() {
    return "";
  }
}
